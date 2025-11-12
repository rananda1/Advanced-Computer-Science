public class NPC {
    
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (!RPSGame.validateChoice(choice)) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice.toLowerCase();
        }
        //this.choice = choice.toLowerCase();
    }

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String toString() {
        return "Opponent chose " + choice +".";
    }








}
