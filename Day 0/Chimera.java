public class Chimera extends Monster {

    public Chimera() {
        super("Chimera", ElementType.FIRE, 2, 3, 4, 5, "Pepper breath", "Deathly scream", ElementType.FIRE,
                ElementType.AIR);
    }

    public String victoryNoise() {
        return "Roar";
    }

    public void attack(Monster opponent) {

    }

    public void performSingleElementalAttack(int attackNumber, Monster opponent) {

    }

    public void performDoubleDownAttack(Monster opponent) {

    }

}
