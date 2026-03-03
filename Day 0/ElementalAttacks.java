public interface ElementalAttacks {

    // to-do: Implement the attack method for ElementalAttacks
    // Every monster has 2 different attacks, each with different damage and type.
    // There is a 45% chance the monster should use AttackOne
    // There is a 45% chance the monster should use AttackTwo
    // There is a 10% chance the monster doubles down and uses BOTH attacks with
    // doubleDown Attack
    // - The double down attack is only available once per battle.
    // - After using double down, the attack probability is 50% / 50% for Attacks
    // 1/2
    default void attack(Monster opponent) {
        // implement this method here

        int random = Random.nextInt(3);
        if (random == 1) {
            performSingleElementalAttack(random, opponent);
        }
        if (random == 2) {
            performSingleElementalAttack(random, opponent);
        }
        if (random == 3) {
            performSingleElementalAttack(random, opponent);
        }

    }

    // to-do: Implement the attack method for performSingleElementalAttack
    // The current moster attacks the opponent using the attackNumber provided
    default void performSingleElementalAttack(int attackNumber, Monster opponent) {
        // implement this method here

        int stab = 0;

        if (element == opponent.getElement()) {
            stab = 1.5;
        } else {
            stab = 1;
        }
    



        int damage = 0;

        if (attackNumber == 1) {
            damage = 10 * getStab(monster.getAttackElementOne(), opponent) * getElementalMultiplier(monster.getAttackElementOne(), monster.getElement())
            opponent.takeDamage(damage);
    
        } 
        if (attackNumber == 2) {
            damage = 10 * getStab(monster.getAttackElementTwo(), opponent) * getElementalMultiplier(monster.getAttackElementTwo(), monster.getElement())
            opponent.takeDamage(damage);
        }
        

    }

    // to-do: Implement the useDoubleDown() method for the monster
    // This method is called when the monster uses their double down attack.
    // The double down attack is only available once per battle
    // If the monster has already used their double down attack, print a message
    // saying so and
    // return. The
    // monster effectively loses their turn.
    default void performDoubleDownAttack(Monster opponent) {
        // implement this here

        if (opponent.hasUsedDoubleDown()) {
            return;
        }

        int damage = 0;

        damage = 10 * getStab(monster.getAttackElementTwo(), opponent)
                * getElementalMultiplier(monster.getAttackElementTwo(),
                        monster.getElement());
        damage += 10 * getStab(monster.getAttackElementOne(), opponent) *
                getElementalMultiplier(monster.getAttackElementOne(), monster.getElement());

        opponent.takeDamage(damage);
        opponent.hasUsedDoubleDown() = true;

    }

    // public double getStab(ElementType element, Monster opponent) {
    // if (element == opponent.getElement()) {
    // return 1.5;
    // }
    // return 1;
    // }

    // to-do: didAttackCrit
    // returns a boolean if an attack critically struck based on the speed of the
    // attacking monster
    public static boolean didAttackCrit(int speed) {
        return false; // doesnt actually always return false. please implement!
    }

    /**
     * Returns true if attackType is super effective against defenderType.
     * Fire->Air, Air->Earth, Earth->Water, Water->Fire
     */
    static boolean isSuperEffectiveAgainst(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return false;
        return (attackType == ElementType.FIRE && defenderType == ElementType.AIR)
                || (attackType == ElementType.AIR && defenderType == ElementType.EARTH)
                || (attackType == ElementType.EARTH && defenderType == ElementType.WATER)
                || (attackType == ElementType.WATER && defenderType == ElementType.FIRE);
    }

    /**
     * Returns the effectiveness multiplier: 2.0 (super), 1.0 (normal), or 0.5
     * (low).
     */
    static double getElementalMultiplier(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return 1.0;
        if (isSuperEffectiveAgainst(attackType, defenderType))
            return 2.0;
        if ((attackType == ElementType.FIRE && (defenderType == ElementType.WATER || defenderType == ElementType.FIRE))
                || (attackType == ElementType.WATER
                        && (defenderType == ElementType.EARTH || defenderType == ElementType.WATER))
                || (attackType == ElementType.EARTH
                        && (defenderType == ElementType.AIR || defenderType == ElementType.EARTH))
                || (attackType == ElementType.AIR
                        && (defenderType == ElementType.FIRE || defenderType == ElementType.AIR)))
            return 0.5;
        return 1.0;
    }
}
