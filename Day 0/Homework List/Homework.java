
public class Homework {

    private int daysUntilDue;
    private Course forWhatCourse;
    private String description;

    public int getDaysUntilDue() {
        return daysUntilDue;
    }

    public String getDescription() {
        return description;
    }

    public Course getForWhatCourse() {
        return forWhatCourse;
    }

    public void setDaysUntilDue(int daysUntilDue) {
        this.daysUntilDue = daysUntilDue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setForWhatCourse(Course forWhatCourse) {
        this.forWhatCourse = forWhatCourse;
    }

    public Homework(Course forWhatCourse, String description, int daysUntilDue) {
        this.forWhatCourse = forWhatCourse;
        this.description = description;
        this.daysUntilDue = daysUntilDue;
    }

    public String toString() {
        return "" + getDaysUntilDue() + " " + getForWhatCourse() + " Homework: " + getDescription();
    }

}
