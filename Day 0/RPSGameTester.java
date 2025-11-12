public class RPSGameTester {
    public static void main(String[] args) {

        // System.out.println(RPSGame.generateRandomChoice());
        // //Player player1 = new Player();
        // Player player1 = new Player();
        // NPC npc1 = new NPC();
        // RPSGame game1 = new RPSGame(player1, npc1);
        // System.out.println(RPSGame.validateChoice("paper"));
        // game1.start();
        // System.out.println(game1.toString());

        for (int i = 0; i < 3; i++) {
            System.out.println("\nRound " + (i + 1));
            Player player = new Player();
            NPC npc = new NPC();
            RPSGame game = new RPSGame(player, npc);
            game.start();
            System.out.println(game.displayResults());
        }

    }









}