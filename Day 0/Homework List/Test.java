
public class Test extends Work {

    public Test(String description, double hoursNeeded, int daysUntil) {
        super(description, hoursNeeded, daysUntil);
    }

    public void studyForTest(double timeSpent) {
        if (timeSpent > getHoursNeeded()) {
            setHoursNeeded(0);
        } else {
            setHoursNeeded(getHoursNeeded() - timeSpent);
        }
    }

    public String toString() {
        return "" + getDaysUntil() + " days: " + getDescription() + " Test (Study for " + getHoursNeeded() + " hours)";
    }

    // public int compareTo(Object o) {
    // Test other = (Test) o;
    // if (getDaysUntil() > other.getDaysUntil()) {
    // return getDaysUntil();
    // } else {
    // return other.getDaysUntil();
    // }
    // }

}
