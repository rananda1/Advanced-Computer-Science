import java.util.ArrayList;

public class Course {

    // private String teacherName;
    private String name;
    // private int numberOfStudents;

    private ArrayList<Work> thingsToDo;

    public String getName() {
        return name;
    }

    public ArrayList<Work> getThingsToDo() {
        return thingsToDo;
    }

    public void setThingsToDo(ArrayList<Work> thingsToDo) {
        this.thingsToDo = thingsToDo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name, ArrayList<Work> thingsToDo) {
        this.name = name;
        this.thingsToDo = thingsToDo;

    }

    public String list() {
        // String list = "To Do List:\n";

        String list = "";
        for (int i = 0; i < thingsToDo.size(); i++) {
            if (!thingsToDo.get(i).toString().equals("")) {
                list += "" + thingsToDo.get(i).toString() + "\n";
            }
        }

        // list += "To Do List:\n\nTests:";
        // for (int i = 0; i < assesments.size(); i++) {
        // list += "\n- " + assesments.get(i).toString();
        // }
        // list += "\n\nHomework:";
        // for (int i = 0; i < assignments.size(); i++) {
        // list += "\n- " + assignments.get(i).toString();
        // }

        return list;
    }

    public String sortedList() {
        sortWork();
        return list();
    }

    public void sortWork() {

        // String newWord = "";
        // char[] letters = originalWord.toLowerCase().toCharArray();

        // ArrayList<Work> newList = new ArrayList<Work>();

        for (int i = 0; i < thingsToDo.size(); i++) {

            int starting = i;

            for (int o = i + 1; o < thingsToDo.size(); o++) {
                if (thingsToDo.get(o).getDaysUntil() < thingsToDo.get(starting).getDaysUntil()) {
                    starting = o;
                }
            }

            Work temporary = thingsToDo.get(i);
            thingsToDo.set(i, thingsToDo.get(starting));
            thingsToDo.set(starting, temporary);
        }

    }

}
