import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Homework> assignments;
    private ArrayList<Test> assesments;

    public ArrayList<Test> getAssesments() {
        return assesments;
    }

    public ArrayList<Homework> getAssignments() {
        return assignments;
    }

    public void setAssesments(ArrayList<Test> assesments) {
        this.assesments = assesments;
    }

    public void setAssignments(ArrayList<Homework> assignments) {
        this.assignments = assignments;
    }

    public String list() {
        String list = "";
        list += "To Do List:\n\n\tTests:";
        for (int i = 0; i < assesments.size(); i++) {
            list += "\t- " + assesments.get(i).toString();
        }
        list += "\n\nHomework:";
        for (int i = 0; i < assignments.size(); i++) {
            list += "\t- " + assignments.get(i).toString();
        }

    }

}
