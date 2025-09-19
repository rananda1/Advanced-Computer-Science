public class Student {
    private String name;
    private int grade;
    private String id;
    //private String generateId();

    public Student(String newName, int newGrade) {
        name = newName;
        grade = newGrade;
    
    }
    
    public Student(String name) {
        this.name = name;
        this.id = generateId();
    }

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
        this.grade = 10;
    }

    public String generateId() {
        id = " " + (int) (Math.random() * 8 + 1) + (int) (Math.random() * 8 + 1) 
        + (int) (Math.random() * 8 + 1) + "-" + (int) (Math.random() * 9 + 1) 
        + (int) (Math.random() * 8 + 1) + (int) (Math.random() * 8 + 1) + (int) (Math.random() * 8 + 1) + " ";
        return id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " is in grade " 
        + grade + " and the students ID is " + id + ".";
    }














}
