public class Student {
    private String name;
    private int grade;
    private String id;
    private String latestOpp;
    //private String recentFriend;

    public String getLatestOpp() {
        return latestOpp;
    }

    //public String getRecentFriend() {
    //    return recentFriend;
    //}

    //public void setLatestOpp(String newLatestOpp) {
    //    latestOpp = newLatestOpp;
    //}

    //public void setRecentFriend(String newRecentFriend) {
    //    recentFriend = newRecentFriend;
    //}

    public String vibeCheck(Student otherStudent) {
        if (
            this.latestOpp == otherStudent.latestOpp
        ) {
            return this.name + " and " + otherStudent.name 
                + " are now friends! They both dislike " + this.latestOpp + ".";
        } else {
            return "They do not have that shared opp.";
        }
         
    }

    //public void vibeCheck(Student otherStudent) {
    //    if (
    //        this.latestOpp == otherStudent.latestOpp
    //    ) {
    //        this.recentFriend = otherStudent.name;
    //        otherStudent.recentFriend = this.name;
    //        System.out.println(this.name + " and " + otherStudent.name 
    //        + " are now friends! They both dislike " + this.latestOpp + ".");
    //    } else {
    //        System.out.println("They do not have that shared opp.");
    //    }
         
    //}

    public Student(int newGrade, String newName, String newLatestOpp) {
        this.name = newName;
        this.grade = newGrade;
        this.latestOpp = newLatestOpp;
        this.id = generateId();
    
    }
    
    public Student(String newName, String newLatestOpp) {
        this.name = newName;
        this.grade = 10;
        this.latestOpp = newLatestOpp;
        this.id = generateId();
        
    }

    public Student(String newName) {
        this.name = newName;
        this.grade = 10;
        this.id = generateId();
    }

    public Student(String newName, int newGrade) {
        this.name = newName;
        this.grade = newGrade;
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
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    //was the word generate instead of set but had to change for code grade
    // when to use this. ?
    public String generateId() {
        id = "" + (int) (Math.random() * 8 + 1) + (int) (Math.random() * 8 + 1) 
            + (int) (Math.random() * 8 + 1) + "-" + (int) (Math.random() * 9 + 1) 
            + (int) (Math.random() * 9 + 1) + (int) (Math.random() * 9 + 1) 
            + (int) (Math.random() * 9 + 1) + "";
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
            this.name.equals(otherStudent.name) 
                &&
                this.grade == otherStudent.grade 
                &&
                this.id.equals(otherStudent.id)
        ) {
            return true;
        } else {
            return false;
        }
    }














}
