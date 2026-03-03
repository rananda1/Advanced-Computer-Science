import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot

    // Generate a random integer (full range)intrandomInt =random.nextInt();
    // System.out.println("Random int: " +randomInt);

    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        // TODO

        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        int random = rng.nextInt(2);
        // System.out.println("Random int: " + random);
        String starter = "";
        if (random == 1) {
            starter = "Player";
        } else {
            starter = "Bot";
        }
        System.out.println("== CARD CLASH ==\nStarting: " + starter);

        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {
            if (starter.equals(player.name)) {
                drawAndPlayIfNeeded(player, bot);
                attackOnce(player, bot);
                drawAndPlayIfNeeded(bot, player);
                attackOnce(bot, player);
            } else {
                drawAndPlayIfNeeded(bot, player);
                attackOnce(bot, player);
                drawAndPlayIfNeeded(player, bot);
                attackOnce(player, bot);
            }
        }

        if (player.hasAnythingLeft()) {
            System.out.println("Winner: Player");
            return "Player";
        } else {
            System.out.println("Winner: Bot");
            return "Bot";
        }

        // return null;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        // TODO
        if (self.active == null && !self.deck.isEmpty()) {

            self.active = self.deck.remove(0);
            Ability a = self.active.resolvedAbility();
            self.active.applySelfOnPlay(a);

            if (a.cyclesOnPlay()) {

                if (other.active != null) {
                    other.active.takeDamage(a.pingDamageOnPlay());
                } else {
                    other.pendingDamage += a.pingDamageOnPlay();
                }

                self.deck.add(self.active);
                self.active = null;

                // drawAndPlayIfNeeded(self, other);
                // return;

                if (self.deck.isEmpty()) {
                    return;
                }

                self.active = self.deck.remove(0);
                self.active.applySelfOnPlay(self.active.resolvedAbility());
            }

        }

        // if (self.pendingDamage > 0 && self.active != null) {
        // self.active.takeDamage(self.pendingDamage);
        // self.pendingDamage = 0;

        // if (self.active.isDefeated()) {
        // self.active = null;
        // drawAndPlayIfNeeded(self, other); // draw new card if any
        // }
        // }

        // if (self.active != null && other.active != null) {
        // int dmg = self.active.computeDamageAgainst(other.active);
        // other.active.takeDamage(dmg);

        // if (other.active.isDefeated()) {
        // other.active = null;
        // }
        // }

    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        // TODO

        if (attacker.active == null || defender.active == null) {
            return;
        }

        int damage = attacker.active.computeDamageAgainst(defender.active);
        defender.active.takeDamage(damage);

        if (defender.active.isDefeated()) {
            defender.active = null;
        }

    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DecksAndChecks.buildDefaultDeck();
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DecksAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
