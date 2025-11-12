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
        String name = scan.nextLine();
        player.setName(name);
        String choice = scan.nextLine();
        player.setChoice(choice);
        int timesLeft = 3;
        while (!RPSGame.validateChoice(choice) && timesLeft > 0) {
            timesLeft = timesLeft - 1;
            System.out.println("That is not a valid choice, try again.");
            choice = scan.next();
            player.setChoice(choice);
            //player.setChoice(choice);
            // if (timesLeft <= 0) {
            //     //choice = generateRandomChoice();
            //     player.setChoice(generateRandomChoice());
            //     System.out.println("You are out of tries. Your new choice is " + player.getChoice());
            // }
        }
        // if (timesLeft < 0) {
        //     choice = generateRandomChoice();
        //     System.out.println("You are out of tries. Yyour new choice is " + choice);
        // }
        //player.setChoice(choice);
        if (timesLeft <= 0) {
            //choice = generateRandomChoice();
            player.setChoice(generateRandomChoice());
            System.out.println("You are out of tries. Your new choice is " + player.getChoice());
        }
        scan.close();

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
        if (didPlayerWin() == true) {
            return "\nOpponenet won!\nBetter luch next time!";
        } else {
            return "\n" + player.getName() + " won!\nCongratulations!";
        }
        //return player.getChoice();
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.toString() + "\n" + opponent.toString() 
            + "\n" + toString();
    }

    public static String generateRandomChoice() {
        int num = (int) (Math.random() * 3 + 1);
        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "scissors";
        }
        //return //random.choice("rock", "paper", "scissors");
        //return "" + num;
    }





    public static boolean validateChoice(String choice) {
        //String newChoice = choice.toLowerCase();
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }








}

