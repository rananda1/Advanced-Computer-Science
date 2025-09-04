public class RectangleTester {
    public static void main(String[] args) {
        // this is called a decalration and the format is type and then name
        // initialization = new type();
        Rectangle joe = new Rectangle();
        Rectangle moe = new Rectangle();
        Rectangle curly = new Rectangle();
        Rectangle olivia = new Rectangle(6,7);
        Rectangle stout = new Rectangle(8);

        System.out.println("Testing getWidth:" + joe.getWidth());
        System.out.println("Testing getLength:" + olivia.getLength());
        System.out.println(stout.getLength());


    }
    


}
