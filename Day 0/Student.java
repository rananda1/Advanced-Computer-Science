public class Student {
    private String name;
    private int grade;
    private String id;
    //private String generateId();

    public Student(int newGrade, String newName) {
        name = newName;
        grade = newGrade;
        this.id = generateId();
    
    }
    
    public Student(String name) {
        this.name = name;
        grade = 10;
        this.id = generateId();
        
    }

    //public Student(String id) {
      //  this.id = generateId();
    //}

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
        + (int) (Math.random() * 9 + 1) + (int) (Math.random() * 9 + 1) 
        + (int) (Math.random() * 9 + 1) + " ";
        return id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " is in grade " 
        + grade + " and the students ID is " + this.id + ".";
    }

    public boolean equals(Student otherStudent) {
        if (
            this.name == otherStudent.name &&
            this.grade == otherStudent.grade &&
            this.id == otherStudent.id
        ) {
            return true;
        } else {
            return false;
        }
    }












}
