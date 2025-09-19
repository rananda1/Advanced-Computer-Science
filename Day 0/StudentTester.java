public class StudentTester {
    
    public static void main(String[] args) {
        
        Student sophmore = new Student (10, "Jojo");
        Student junior = new Student ("Rose");
        System.out.println(sophmore.toString());
        System.out.println(junior);
        System.out.println("This sophmore student equals this junior student: "
        + sophmore.equals(junior));







    }




}
