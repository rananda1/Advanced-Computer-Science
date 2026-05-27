import java.util.ArrayList;
// import java.util.Collections;

public class ToDoList {

    private ArrayList<Course> courses;

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    // public ArrayList<Work> getThingsToDo() {
    // return thingsToDo;
    // }

    // public void setToDo(ArrayList<Work> thingsToDo) {
    // this.thingsToDo = thingsToDo;
    // }

    public ToDoList(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String makeCheckList() {
        String checkList = "To Do List:\n";
        for (int i = 0; i < courses.size(); i++) {
            checkList += "\n" + courses.get(i).getName() + "\n" + courses.get(i).sortedList();
        }
        return checkList;
    }

    // public String sortedList() {
    // Collections.sort(assesments);
    // Collections.sort(assignments);
    // return list();
    // }

}
