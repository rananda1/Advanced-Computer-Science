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

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Name: ");
        // String s = sc.nextLine();
        // String name = s;

        // System.out.println("Card Type: ");
        // String o = sc.nextLine();
        // while (CardType.fromText(o) != CardType.GRANITE && CardType.fromText(o) !=
        // CardType.PARCHMENT && CardType.fromText(o) != CardType.BLADE) {
        // System.out.println("Invalid. Input new card type: ");
        // o = sc.nextLine();
        // }
        // String type = o;
        // //CardType type2 = (o.toUpperCase());

        // System.out.println("Strength: ");
        // int n = Integer.parseInt(sc.nextLine());
        // while (n > 5 || n < 1) {
        // System.out.println("Invalid. Input new strength: ");
        // n = Integer.parseInt(sc.nextLine());
        // }
        // int strength = n;

        // System.out.println("Toughness: ");
        // int t = Integer.parseInt(sc.nextLine());
        // while (t > 5 || t < 1) {
        // System.out.println("Invalid. Input new toughness: ");
        // t = Integer.parseInt(sc.nextLine());
        // }
        // int toughness = t;

        // while (toughness + strength > 6) {

        // }

        // System.out.println("Bastion? (y/n): ");
        // String y = sc.nextLine().toLowerCase();
        // while (!y.equals("y") && !y.equals("n")) {
        // System.out.println("Invalid. Input y or n: ");
        // y = sc.nextLine().toLowerCase();
        // }
        // if (y.toLowerCase().equals("y")) {
        // boolean bastion = true;
        // } else {
        // boolean bastion = false;
        // }

        // System.out.println("Ripple? (y/n): ");
        // String x = sc.nextLine().toLowerCase();
        // while (!x.equals("y") && !x.equals("n")) {
        // System.out.println("Invalid. Input y or n: ");
        // x = sc.nextLine().toLowerCase();
        // }
        // if (x.equals("y")) {
        // boolean ripple = true;
        // } else {
        // boolean ripple = false;
        // }

        // System.out.println("Cleave? (y/n): ");
        // String z = sc.nextLine().toLowerCase();
        // while (!z.equals("y") && !z.equals("n")) {
        // System.out.println("Invalid. Input y or n: ");
        // z = sc.nextLine().toLowerCase();
        // }
        // if (z.toLowerCase().equals("y")) {
        // boolean cleave = true;
        // } else {
        // boolean cleave = false;
        // }

        ArrayList<Card> deck = new ArrayList<Card>(5);
        for (int i = 0; i < deck.size(); i++) {
            NamedCard card = new NamedCard(scanName(sc), scanCardType(sc), scanStrength(sc), scanToughness(sc),
                    scanBastion(sc), scanRipple(sc), scanCleave(sc));
            // while (card.getStrength() + card.getToughness() > 6) {
            // System.out.println("Invalid. Input new properties: ");
            // card = new NamedCard(scanName(sc), scanCardType(sc), scanStrength(sc),
            // scanToughness(sc),
            // scanBastion(sc), scanRipple(sc), scanCleave(sc));
            // }
            deck.set(i, card);
        }

        // NamedCard card = new NamedCard(name, CardType.(type.toUpperCase()), strength,
        // toughness, bastion, ripple, cleave);
        // deck.set(i, card);

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
