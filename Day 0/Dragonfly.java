public class Dragonfly extends Animal {
    // private int age;
    // private String name;
    private int feetAboveTheGround;
    private int wingspan;
    private String color;
    // private String habitat;

    // public int getAge() {
    // return age;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFeetAboveTheGround() {
        return feetAboveTheGround;
    }

    public void setFeetAboveTheGround(int feetAboveTheGround) {
        this.feetAboveTheGround = feetAboveTheGround;
    }

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

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public Dragonfly(String name, int age, int wingspan, String habitat, String color) {
        super(name, age, habitat);
        this.feetAboveTheGround = 0;
        // this.name = name;
        // this.age = age;
        // this.habitat = habitat;
        this.color = color;
        this.wingspan = wingspan;
    }

    public void fly(int feetHigher) {
        this.feetAboveTheGround += feetHigher;
    }

    public String changeColor(String color) {
        this.color = color;
        return getName() + " is now " + color + ".";
    }

    public void birthday() {
        setAge(getAge() + 1);
    }

    public String toString() {
        return getName() + " is a " + getAge() + " year old dragonfly who lives in " + getHabitat()
                + ". It is currently flying " + feetAboveTheGround + " feet above the ground, is "
                + color + ", and has a wingspan of " + wingspan + " inches.";
    }

    public void makeNoise() {

    }

}
