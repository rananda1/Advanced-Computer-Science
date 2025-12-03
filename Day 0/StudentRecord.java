public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;
    public StudentRecord[] rose2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    
    
    
    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters
    // to-do: implement getTestScore

    // inherited methods
    // to-do: implement toString

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int total = 0;
        int num = 0;
        for (int i = first; i <= last; i++) {
            total = total + scores[i];
            num += 1;
        }

        return (double) total / num;
    }


    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber > scores.length - 1) {
            return -1;
        } else {
            return scores[testNumber];
        }

    }





        
        
        
    //

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {

        boolean answer = false;
        int score = 0;
        for (int j = 0; j < scores.length; j++) {
            //score = score[j];
            if (scores[j] > score) {
                answer = true;
            } else {
                answer = false;
            }
            score = scores[j];
        }

        //if (!answer)

        return answer;


        //return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        
        if (!hasImproved()) {
            return getAverage(0, scores.length - 1);
        } else {
            return getAverage(scores.length / 2, scores.length - 1);    
            // (scores.length - 1) / 2, (scores.length - 1));
        }
        
        //return 0.0;
    }



    public String toString() {
        String scoresString = "";
        for (int i = 0; i < scores.length; i++) {
            scoresString += ", " + scores[i];
        }
        if (scoresString.length() > 2) {
            scoresString = "[" + scoresString.substring(2) + "]";
        } else {
            scoresString = "[" + scoresString + "]";
        }

        return name + "'s scores: " + scoresString;
    }


    public boolean equals(StudentRecord other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }






}