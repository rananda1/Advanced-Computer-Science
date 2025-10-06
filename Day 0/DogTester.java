public class DogTester {
    
    public static void main(String[] args) {

        Dog Jojo = new Dog("Jojo", "Rose", 3, 123);
        Dog Jojo2 = new Dog("Jojo2", "Rose", 4, 234);
        Dog Jojo3 = new Dog("Jojo3", "Rose", 5, 345);

        System.out.println(Jojo.getName());
        System.out.println(Jojo2.toString());
        System.out.println(Jojo3.getDogTag());
        Jojo.setName("jojo");
        System.out.println(Jojo.getName());
        System.out.println(Jojo.getDogTag());

        System.out.println(pickup(Jojo, "Rose"));


















    }





}
