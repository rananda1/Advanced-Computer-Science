
public class Course {

    private String teacherName;
    private String name;
    private int numberOfStudents;

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Course(String name, String teacherName, int numberOfStudents) {
        this.name = name;
        this.teacherName = teacherName;
        this.numberOfStudents = numberOfStudents;
    }

}
