
public class Homework extends Work {
    // implements Comparable
    // private int daysUntilDue;
    // // private Course forWhatCourse;
    // private String description;

    private boolean complete;

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Homework(String description, double hoursNeeded, int daysUntil) {
        super(description, hoursNeeded, daysUntil);
        this.complete = false;
    }

    public void doHomework() {
        setComplete(true);
    }

    public String toString() {
        if (complete) {
            return "";
        } else {
            return "" + getDaysUntil() + " days: " + getDescription() + " Homework (" + getHoursNeeded() + " hours)";
        }
    }

}
