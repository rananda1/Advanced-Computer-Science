public class HubTester {

    public static void main(String[] args) {

        // assignment exceptions

        System.out.println("Assignment class exceptions:\n");

        try {
            Assignment work = new Assignment(null, "description");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Assignment work = new Assignment("title", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        // student exceptions

        System.out.println("\n\nStudent class exceptions:\n");

        try {
            Student student3 = new Student("student", "password", "email");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This student threw an intentional exception.");
        }

        try {
            Student student2 = new Student("student", "password", "email@.");
            Student student1 = new Student("student", "password", "email@.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This student threw an intentional exception.");
        }

        try {
            Student student2 = new Student("student@", "password", "email@.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This student threw an intentional exception.");
        }

        try {
            Student student = new Student("name", "password", "email@.");
            student.changeName("@");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Student student = new Student("name", "password", "email@.");
            student.changeName("name");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Student student = new Student("name", " ", "email@.");
            // student.requireNotBlank(null, "field");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Student student = new Student("name", null, "email@.");
            // student.requireNotBlank(" ", "field");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        // hub exceptions
        System.out.println("\n\nHub class exceptions:\n");

        try {
            Hub hub = new Hub();
            hub.registerStudent("Name", "password", "email@.");
            hub.doesStudentExist("Name");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Hub hub1 = new Hub();
            hub1.loginStudent("username", "Password");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Hub hub = new Hub();
            hub.registerStudent("username", "password", "email@.");
            hub.loginStudent("username", "pass");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Hub hub1 = new Hub();
            hub1.registerStudent("username", "password", "email@.");
            hub1.registerStudent("username", "password", "email@.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Hub hub1 = new Hub();
            hub1.registerStudent("username@", "password", "email@.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Hub hub1 = new Hub();
            hub1.registerStudent("username", "password", "email");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        try {
            Hub hub1 = new Hub();
            hub1.registerStudent("username", null, "email");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This threw an intentional exception.");
        }

        // I could't find a way to trigger either of the bad student storage
        // exceptions without changing the hub class because the variables students
        // and studentCount are private and already set so that they will
        // never be null or less than zero

    }

}
