public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    // to-do: implement getters

    // setters
    // to-do: implement setters

    // inherited methods

    // to-do: implement toString

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage

    public String toString() {
        String finalString = "== " + courseName + " ==";
        for (int o = 0; o < enrolledStudents.length; o++) {
            finalString = finalString + "\n" + (o + 1) + ".) " + enrolledStudents[o].toString();
        }
        return finalString + "\n";
    }

    public String findBestStudent() {
        String best = ""; // + enrolledStudents[0];
        // int bestNum = 0;
        for (int l = 1; l < enrolledStudents.length; l++) {
            if (enrolledStudents[l] != null) {
                if (enrolledStudents[l].getAverage(0,
                        enrolledStudents[l].getScores().length - 1) > enrolledStudents[l - 1].getAverage(0,
                                (enrolledStudents[l].getScores().length - 1))) {
                    // best.getAverage(0, (enrolledStudents[l].getScores().length))) {
                    best = "" + enrolledStudents[l].getName();
                }
            }
        }
        return best;
    }

    public double calculateTestAverage(int testNum) {
        int total = 0;
        int num = 0;

        for (int m = 0; m < enrolledStudents.length; m++) {
            total = total + enrolledStudents[m].getScores()[testNum];
            num += 1;
        }

        return (double) total / num;

    }

    public boolean isFull() {
        for (int n = 0; n < enrolledStudents.length; n++) {
            if (enrolledStudents[n] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int g = 0; g < enrolledStudents.length; g++) {
            if (enrolledStudents[g] == null) {
                enrolledStudents[g] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int g = 0; g < enrolledStudents.length; g++) {
            if (enrolledStudents[g] == student) {
                enrolledStudents[g] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int num = 0;
        for (int g = 0; g < enrolledStudents.length; g++) {
            if (enrolledStudents[g] != null) {
                num += 1;
            }
        }
        return num;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newArray = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int g = 0; g < enrolledStudents.length; g++) {
            newArray[g] = enrolledStudents[g];
        }
        enrolledStudents = newArray;
    }

    // public boolean equals(Course other) {
    // if
    // }

}
