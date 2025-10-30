public class PurrfectCareTester {
    public static void main(String[] args) {

        Cat cat1 = new Cat("cat1", "Rose", 3, "2345");
        Cat cat2 = new Cat("cat2", "Rose", 3, "1234");

        cat2.setName("cat1");
        cat1.setCatId("1234");
        System.out.println(cat1.getCatId());
        System.out.println(cat2.generateCatTag());
        System.out.println("\n\n");
        System.out.println(cat1.equals(cat2));
        System.out.println("\n\n");
        PurrfectUtils.bootUp(cat1);
        System.out.println("\n\n");
        PurrfectUtils.pet(cat2);
        System.out.println("\n\n");
        for (int r = 0; r < 4; r++) {
            PurrfectUtils.trimClaws(cat2);
        }
        System.out.println("\n\n");
        PurrfectUtils.cleanLitterBox(cat1);
        System.out.println("\n\n");
        PurrfectUtils.feed(cat2);

        cat1.setHungry(true);
        cat2.setHungry(false);


































    }
}
