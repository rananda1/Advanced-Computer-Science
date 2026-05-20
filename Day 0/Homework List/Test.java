
public class Test {

    private int daysUntil;
    private Course forWhatCourse;
    // private String description;
    private double howLongToStudy;

    public double getHowLongToStudy() {
        return howLongToStudy;
    }

    public void setHowLongToStudy(double howLongToStudy) {
        this.howLongToStudy = howLongToStudy;
    }

    public int getDaysUntil() {
        return daysUntil;
    }

    // public String getDescription() {
    // return description;
    // }

    public Course getForWhatCourse() {
        return forWhatCourse;
    }

    public void setDaysUntil(int daysUntil) {
        this.daysUntil = daysUntil;
    }

    // public void setDescription(String description) {
    // this.description = description;
    // }

    public void setForWhatCourse(Course forWhatCourse) {
        this.forWhatCourse = forWhatCourse;
    }

    public Test(Course forWhatCourse, int howLongToStudy, int daysUntil) {
        this.forWhatCourse = forWhatCourse;
        this.howLongToStudy = howLongToStudy;
        this.daysUntil = daysUntil;
    }

    public String toString() {
        return "" + getDaysUntil() + " " + getForWhatCourse() + " Homework: Study for " + howLongToStudy + " hours.";
    }

}
