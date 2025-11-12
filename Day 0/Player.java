public class Player {
    
    private String name;
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice.toLowerCase();
        if (!RPSGame.validateChoice(this.choice)) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice.toLowerCase();
        }
        // this.choice = RPSGame.validateChoice(choice);
        // this.choice = this.choice.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }











}
