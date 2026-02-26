import java.util.ArrayList;
import java.util.Scanner;

public class DeckAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {

        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {

        int num = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).abilityCount() >= 1) {
                num += 1;
            }
        }
        if (num == 3) {
            return true;
        } else {
            return false;
        }
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {

        int bastion = 0;
        int ripple = 0;
        int cleave = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).hasBastion() == true) {
                bastion += 1;
            } else if (deck.get(i).hasCleave() == true) {
                cleave += 1;
            } else if (deck.get(i).hasRipple() == true) {
                ripple += 1;
            }
        }

        if (ripple > 1 || bastion > 1 || cleave > 1) {
            return false;
        } else {
            return true;
        }

    }

    // Rule: strength and toughness must be 1..5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {

        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getStrength() < 1 || deck.get(i).getStrength() > 5) {
                return false;
            }
            if (deck.get(i).getToughness() < 1 || deck.get(i).getToughness() > 5) {
                return false;
            }
            if (deck.get(i).getToughness() + deck.get(i).getStrength() > 6) {
                return false;
            }

        }
        return true;

    }

    public static boolean isValidDeck(ArrayList<Card> deck) {
        // TODO: return true only if:
        if (deck.size() != 5) {
            return false;
        }
        if (checkStatsInRange(deck) == true && checkNoDuplicateAbilities(deck) == true
                && checkNoMoreThanThreeAbilityCards(deck) == true && checkOneAbilityPerCard(deck)) {
            return true;
        } else {
            return false;
        }

    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return
    // deck
    // of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {

        ArrayList<Card> deck = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) {
            NamedCard card = new NamedCard("card", CardType.GRANITE, i, i, true, false, false);
            deck.set(i, card);
        }
        return deck;

    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        // TODO
       
        ArrayList<Card> deck = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: ");
            String s = sc.nextLine();
            String name = s;

            System.out.println("Card Type: ");
            String o = sc.nextLine();
            while (CardType.fromText(o) != CardType.GRANITE && CardType.fromText(o) != CardType.PARCHMENT && CardType.fromText(o) != CardType.BLADE) {
               System.out.println("Invalid. Input new card type: "); 
               o = sc.nextLine();
            }
            String type = o;

            System.out.println("Strength: ");
            int n = Integer.parseInt(sc.nextLine());
            while (n > 5 || n < 1) {
                System.out.println("Invalid. Input new strength: ");
                n = Integer.parseInt(sc.nextLine());
            }
            int strength = n;

            System.out.println("Toughness: ");
            int t = Integer.parseInt(sc.nextLine());
            while (t > 5 || t < 1) {
                System.out.println("Invalid. Input new toughness: ");
                t = Integer.parseInt(sc.nextLine());
            }
            int toughness = t;

            System.out.println("Bastion? (y/n): ");
            String y = sc.nextLine().toLowerCase();
            while (!y.equals("y") && !y.equals("n")) {
                System.out.println("Invalid. Input y or n: ");
                y = sc.nextLine().toLowerCase();
            }
            if (y.toLowerCase().equals("y")) {
                boolean bastion = true;
            } else {
                boolean bastion = false;
            }

            System.out.println("Ripple? (y/n): ");
            String x = sc.nextLine().toLowerCase();
            while (!x.equals("y") && !x.equals("n")) {
                System.out.println("Invalid. Input y or n: ");
                x = sc.nextLine().toLowerCase();
            }
            if (x.equals("y")) {
                boolean ripple = true;
            } else {
                boolean ripple = false;
            }

            System.out.println("Ripple? (y/n): ");
            String z = sc.nextLine().toLowerCase();
            while (!z.equals("y") && !z.equals("n")) {
                System.out.println("Invalid. Input y or n: ");
                z = sc.nextLine().toLowerCase();
            }
            if (z.toLowerCase().equals("y")) {
                boolean cleave = true;
            } else {
                boolean cleave = false;
            }

            NamedCard card = new NamedCard(name, CardType.(type.toUpperCase()), strength, toughness, bastion, ripple, cleave);
            deck.set(i, card);
        }
        return deck;
        
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
