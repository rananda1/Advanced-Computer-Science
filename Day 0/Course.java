public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
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
        String finalString = "== Computer Science ==";
        for (int o = 1; o < enrolledStudents.length; o++) {
            finalString = finalString + "\n" + o + ".) " + enrolledStudents[o].toString();
        }
        return finalString;
    }


    public String findBestStudent() {
        String best = "";
        //int bestNum = 0;
        for (int l = 0; l < enrolledStudents.length; l++) {
            if (enrolledStudents[l] != null) {
                if (enrolledStudents[l].getAverage(0, enrolledStudents[l].getScores().length) > best.getAverage(0, (enrolledStudents[l].getScores().length))) {
                    best = "" + enrolledStudents[l];
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








}
