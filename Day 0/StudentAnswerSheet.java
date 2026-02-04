import java.util.ArrayList;

public class StudentAnswerSheet {

    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.answers = answers;
        this.name = name;
        this.testScore = 0.0;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }
        double num = 0.0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals(key.get(i))) {
                num += 1;
            } else if (!answers.get(i).equals("?")) {
                num -= 0.25;
            }
        }
        return num;
    }

}
