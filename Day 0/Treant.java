public class Treant extends Monster {

    public Treant() {
        super("Treant", ElementType.EARTH, 2, 3, 4, 5, "Vine whip", "Air slash", ElementType.EARTH, ElementType.AIR);
    }

    // // Method to get the total sum of the monster's stats
    // public int getTotalStatSum() {
    // return health + attack + defense + speed;
    // }

    // // returns the name of the monster
    // protected String getName() {
    // return name;
    // }

    // // returns the health of the monster
    // public int getHealth() {
    // return health;
    // }

    // // sets the health of the monster
    // public void setHealth(int health) {
    // this.health = health;
    // }

    // // returns the attack of the monster
    // public int getAttack() {
    // return attack;
    // }

    // // sets the attack of the monster
    // public void setAttack(int attack) {
    // this.attack = attack;
    // }

    // // returns the defense of the monster
    // public int getDefense() {
    // return defense;
    // }

    // // sets the defense of the monster
    // public void setDefense(int defense) {
    // this.defense = defense;
    // }

    // // returns the element of the monster
    // public ElementType getElement() {
    // return element;
    // }

    // // sets the element of the monster
    // public void setElement(ElementType element) {
    // this.element = element;
    // }

    // // returns the speed of the monster
    // public int getSpeed() {
    // return speed;
    // }

    // // sets the speed of the monster
    // public void setSpeed(int speed) {
    // this.speed = speed;
    // }

    // // reduces the health of the monster by the damage amount
    // public void takeDamage(int damage) {
    // health -= damage;
    // }

    // // flag double down as used
    // public void useDoubleDown() {
    // hasUsedDoubleDown = true;
    // }

    // // checks if double down has been used
    // public boolean hasUsedDoubleDown() {
    // return hasUsedDoubleDown;
    // }

    public void attack(Monster opponent) {

    }

    public void performSingleElementalAttack(int attackNumber, Monster opponent) {

    }

    public void performDoubleDownAttack(Monster opponent) {

    }

    // public double getStab(ElementType element, Monster opponent) {
    // return 0.0;
    // }

    public String victoryNoise() {
        return "Roar!!";
    }

}
