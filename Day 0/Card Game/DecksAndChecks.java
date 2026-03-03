import java.util.ArrayList;
import java.util.Scanner;

public class DecksAndChecks {

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
        if (num <= 3) {
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
            }
            if (deck.get(i).hasCleave() == true) {
                cleave += 1;
            }
            if (deck.get(i).hasRipple() == true) {
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
            NamedCard card = new NamedCard("card", CardType.GRANITE, 3, 3, false, false, false);
            deck.add(card);
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

            String name = scanName(sc);
            CardType cardType = scanCardType(sc);

            int strength = scanStrength(sc);
            int toughness = scanToughness(sc);
            while (toughness + strength > 6) {
                System.out.println("The sum of strength and toughness must be smaller than 6. Try again.");
                strength = scanStrength(sc);
                toughness = scanToughness(sc);
            }

            int num = 0;
            boolean bastion = scanBastion(sc);
            boolean cleave = scanCleave(sc);
            boolean ripple = scanRipple(sc);
            if (bastion) {
                num += 1;
            }
            if (cleave) {
                num += 1;
            }
            if (ripple) {
                num += 1;
            }
            while (num > 1) {
                System.out.println("Card cannot have more than one ability. Try again. ");
                bastion = scanBastion(sc);
                cleave = scanCleave(sc);
                ripple = scanRipple(sc);
                num = 0;
                if (bastion) {
                    num += 1;
                }
                if (cleave) {
                    num += 1;
                }
                if (ripple) {
                    num += 1;
                }
            }

            NamedCard card = new NamedCard(name, cardType, strength, toughness, bastion, ripple, cleave);

            deck.add(card);
        }

        if (!isValidDeck(deck)) {
            System.out.println("Invalid deck. Try again.");
            return buildUserDeck(sc);

        }

        return deck;

    }

    public static String scanName(Scanner sc) {
        System.out.println("Name: ");
        String s = sc.nextLine();
        String name = s;
        return name;
    }

    public static CardType scanCardType(Scanner sc) {
        System.out.println("Card Type: ");
        // String o = sc.nextLine();
        CardType type = CardType.fromText(sc.nextLine());
        while (type != CardType.GRANITE && type != CardType.PARCHMENT && type != CardType.BLADE) {
            System.out.println("Invalid. Input new card type: ");
            type = CardType.fromText(sc.nextLine());
        }
        return type;
    }

    public static int scanToughness(Scanner sc) {
        System.out.println("Toughness: ");
        int t = Integer.parseInt(sc.nextLine());
        while (t > 5 || t < 1) {
            System.out.println("Invalid. Input new toughness: ");
            t = Integer.parseInt(sc.nextLine());
        }
        return t;
    }

    public static int scanStrength(Scanner sc) {
        System.out.println("Strength: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n > 5 || n < 1) {
            System.out.println("Invalid. Input new strength: ");
            n = Integer.parseInt(sc.nextLine());
        }
        return n;

    }

    public static boolean scanBastion(Scanner sc) {
        boolean bastion = true;
        System.out.println("Bastion? (y/n): ");
        String y = sc.nextLine().toLowerCase();
        while (!y.equals("y") && !y.equals("n")) {
            System.out.println("Invalid. Input y or n: ");
            y = sc.nextLine().toLowerCase();
        }
        if (y.toLowerCase().equals("y")) {
            bastion = true;
        } else {
            bastion = false;
        }
        return bastion;
    }

    public static boolean scanRipple(Scanner sc) {
        boolean ripple = true;
        System.out.println("Ripple? (y/n): ");
        String x = sc.nextLine().toLowerCase();
        while (!x.equals("y") && !x.equals("n")) {
            System.out.println("Invalid. Input y or n: ");
            x = sc.nextLine().toLowerCase();
        }
        if (x.equals("y")) {
            ripple = true;
        } else {
            ripple = false;
        }
        return ripple;
    }

    public static boolean scanCleave(Scanner sc) {
        boolean cleave = true;
        System.out.println("Cleave? (y/n): ");
        String z = sc.nextLine().toLowerCase();
        while (!z.equals("y") && !z.equals("n")) {
            System.out.println("Invalid. Input y or n: ");
            z = sc.nextLine().toLowerCase();
        }
        if (z.toLowerCase().equals("y")) {
            cleave = true;
        } else {
            cleave = false;
        }
        return cleave;
    }

    // public static boolean checkStrengthToughness(Scanner sc) {
    // if (scanToughness(sc) + scanStrength(sc) > 6) {
    // return false;
    // } else {
    // return true;
    // }
    // }

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
