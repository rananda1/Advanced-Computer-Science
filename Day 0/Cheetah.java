public class Cheetah extends Animal {
    // private int age;
    // private String name;
    private int speed;
    private int weight;
    private int numberOfSpots;
    // private String habitat;

    // public int getAge() {
    // return age;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

    // public String getHabitat() {
    // return habitat;
    // }

    // public void setHabitat(String habitat) {
    // this.habitat = habitat;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int numberOfSpots) {
        this.numberOfSpots = numberOfSpots;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cheetah(String name, int age, int weight, String habitat, int numberOfSpots) {
        super(name, age, habitat);
        this.speed = 0;
        // this.name = name;
        // this.age = age;
        // this.habitat = habitat;
        this.numberOfSpots = numberOfSpots;
        this.weight = weight;
    }

    public void eats(int weightOfFood) {
        this.weight += weightOfFood;
    }

    public void goesFaster(int speedIncrease) {
        speed += speedIncrease;
    }

    public String whereItLives() {
        return getName() + " lives in " + getHabitat() + ".";
    }

    public String toString() {
        return whereItLives() + " This cheetah weighs " + weight + " pounds, is "
                + getAge() + " years old, and has " + numberOfSpots + " spots. It is currently moving at "
                + speed + " mph.";
    }

    public void makeNoise() {

    }

}
