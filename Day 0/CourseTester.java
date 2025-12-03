public class CourseTester {
    
    public static void main(String[] args) {

        int[] array = {90, 89, 91, 95};
        //String array2[] = { rose };
        StudentRecord rose = new StudentRecord("Rose", array);
        StudentRecord rose2 = new StudentRecord("Rose2", array);
        // String array2[] = { rose };
        StudentRecord[] arrayRecords = {rose, rose2};
        // // Course compsci = new Course("Computer Science", StudentRecord[]);
        // //Course compsci = new Course("Computer Science", rose);
        //Course compsci = new Course("Computer Science", arrayRecords[]);


        System.out.println("\n" + rose.getAverage(0, 3) + "\n");

        System.out.println(rose.getTestScore(1) + "\n");

        System.out.println(rose.toString() + "\n");


        //Course compsci = new Course("Computer Science", (rose. rose2));
        Course compsci = new Course("Computer Science", arrayRecords);

        System.out.println("\nTesting course: " + compsci.toString());

        System.out.println(compsci.isFull());

        compsci.enrollStudent(rose2);

        System.out.println(compsci.dropStudent(rose2));

        System.out.println(compsci.countEnrolledStudents());

        Course course = new Course("compsci2", 5);

        course.increaseClassSizeBy(3);

        //Course compsci2 = new Course("compsci2", 5);
































    }











}
