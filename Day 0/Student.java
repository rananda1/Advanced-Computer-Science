public class Student {
    private String name;
    private int grade;
    private String id;

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " is in grade " 
        + grade + " and the students ID is " + id + ".";
    }












}
