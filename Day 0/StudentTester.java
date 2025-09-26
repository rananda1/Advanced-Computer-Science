public class StudentTester {
    
    public static void main(String[] args) {
        
        Student sophmore = new Student(10, "Jojo", "Opp");
        Student junior = new Student("Rose", "notOpp");
        System.out.println(sophmore.toString());
        System.out.println(junior.toString());
        System.out.println("This sophmore student equals this junior student: "
            + sophmore.equals(junior));
        System.out.println(sophmore.vibeCheck(junior));
        //System.out.println(sophmore.vibeCheck(junior));

        //sophmore.setId(junior.getId());






    }




}
