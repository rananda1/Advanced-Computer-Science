import java.util.ArrayList;

public class ProjectTester {

    public static void main(String[] args) {

        // Course course1 = new Course("english", "teacher", 20);
        Homework homework1 = new Homework("English Reading", 0.5, 2);
        Homework homework2 = new Homework("Masting Chemistry", 1, 4);
        Test test1 = new Test("Chemistry Final", 3, 1);
        Test test2 = new Test("Reading Quiz", 0.5, 3);

        ArrayList<Work> work1 = new ArrayList<Work>();
        ArrayList<Work> work2 = new ArrayList<Work>();

        work1.add(test2);
        work1.add(homework1);
        work2.add(homework2);
        work2.add(test1);

        Course course1 = new Course("English", work1);
        Course course2 = new Course("Chemistry", work2);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);

        ToDoList list = new ToDoList(courses);

        System.out.println("Before sorting:\n" + course1.list());
        System.out.println("After sorting:\n" + course1.sortedList() + "\n");

        System.out.println(list.makeCheckList());

        // System.out.println("\n\n" + course1.list());

        // System.out.println(list.list() + "\n\n");

        // System.out.println(list.sortedList());

    }

}
