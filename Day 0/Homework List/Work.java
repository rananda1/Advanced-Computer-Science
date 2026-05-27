public abstract class Work {

    private String description;
    private double hoursNeeded;
    // private boolean complete;
    private int daysUntil;

    public int getDaysUntil() {
        return daysUntil;
    }

    public void setDaysUntil(int daysUntil) {
        this.daysUntil = daysUntil;
    }

    public String getDescription() {
        return description;
    }

    public double getHoursNeeded() {
        return hoursNeeded;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHoursNeeded(double hoursNeeded) {
        this.hoursNeeded = hoursNeeded;
    }

    // public void setComplete(boolean complete) {
    // this.complete = complete;
    // }

    // public boolean isComplete() {
    // return complete;
    // }

    public Work(String description, double hoursNeeded, int daysUntil) {
        this.description = description;
        this.hoursNeeded = hoursNeeded;
        this.daysUntil = daysUntil;
        // this.complete = false;
    }

    public String toString() {
        return "";
    }

}
