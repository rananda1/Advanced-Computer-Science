import java.util.Scanner;
public class RPSGame {

    private Player player;
    private NPC opponent;

    public NPC getOpponent() {
        return opponent;
    }

    public void setOpponent(NPC opponent) {
        this.opponent = opponent;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        String name = scan.nextLine();
        int timesLeft = 3;
        while (RPSGame.validateChoice(choice) == false) {
            timesLeft -= 1;
            System.out.println("That is not a valid choice, try again.");
            choice = scan.nextLine();
            if (timesLeft < 0) {
                choice = generateRandomChoice();
                System.out.println("You are out of tries. Yyour new choice is " + choice);
            }
        }

    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals(opponent.getChoice())) {
            return false;
        } 
        if (player.getChoice().equals("rock") 
            && opponent.getChoice().equals("paper")) {
            return false;
        } 
        if (player.getChoice().equals("scissors") 
            && opponent.getChoice().equals("rock")) {
            return false;
        }
        if (player.getChoice().equals("paper") 
            && opponent.getChoice().equals("scissors")) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (didPlayerWin() == false) {
            return "Opponenet won!\nBetter luch next time!";
        } else {
            return player.getName() + " won!\nCongratulations!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.getName() + " chose " 
            + player.getChoice() + ".\nOpponenet chose " + opponent.getChoice() 
            + ".\n" + player.toString();
    }

    public static String generateRandomChoice() {
        int num = (int) Math.random() * 2 + 1;
        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "scissors";
        }
        //return //random.choice("rock", "paper", "scissors");
    }





    public static boolean  validateChoice(String choice) {
        while (choice != "Rock" && choice != "Paper" && choice != "Scissors") {
            return false;
        } 
        return true;
    }








}
