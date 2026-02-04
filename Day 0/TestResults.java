import java.util.ArrayList;

public class TestResults {

    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Cannot be null.");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            submissions.get(i).setTestScore(submissions.get(i).getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {

        if (submissions != null && submissions.size() != 0) {
            String highest = submissions.get(0).getName();
            double num = submissions.get(0).getTestScore();
            for (int i = 1; i < submissions.size(); i++) {
                if (submissions.get(i).getTestScore() > num) {
                    highest = submissions.get(i).getName();
                    num = submissions.get(i).getTestScore();
                }
            }
            return highest;
        } else {
            return "";
        }
    }

}
