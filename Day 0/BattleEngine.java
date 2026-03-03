// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;
import java.util.Random;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {

        if (monster.getAttack() + monster.getDefense() + monster.getHealth() + monster.getSpeed() > 250) {
            return false;
        } else {
            return true;
        }

    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {

        if (monster.getElement() != ElementType.AIR &&
                monster.getElement() != ElementType.EARTH &&
                monster.getElement() != ElementType.WATER
                && monster.getElement() != ElementType.FIRE) {
            return false;
        } else {
            return true;
        }

    }

    // to-do: correctStats
    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        monster.setAttack(50);
        monster.setDefense(50);
        monster.setHealth(50);
        monster.setSpeed(50);
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0.
    // It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {

        while (monster1.getHealth() != 0 && monster2.getHealth() != 0) {

            int random = Random.nextInt(2);

            if (random == 1) {
                monster1.attack(monster2);
                displayStatus(monster1, monster2);
                monster2.attack(monster1);
                displayStatus(monster1, monster2);
            } else {
                monster2.attack(monster1);
                displayStatus(monster1, monster2);
                monster1.attack(monster2);
                displayStatus(monster1, monster2);
            }

        }

        if (monster1.getHealth() == 0) {
            monster2.victoryNoise();
            return monster2;
        } else {
            monster1.victoryNoise();
            return monster1;
        }

    }

    // to-do: battleEveryone
    // method battles monsters found in an ArrayList.
    public static Monster battleEveryone(ArrayList<Monster> monsters) {

        for (int i = 0; i < monsters.size(); i++) {

            if (i != 0) {
                startBattle(monsters.get(0), monsters.get(i));
            }

        }

        return null;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        // System.out.println("Chimney the Chimera: 50 health vs Truant the Treant: 10
        // health");
        System.out.println(monster.getName() + ": " + monster.getHealth() +
                " health vs " + opponent.getName() + ": " + opponent.getHealth() + " health");
    }

}