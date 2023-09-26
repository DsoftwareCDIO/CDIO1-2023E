package game;

public class DiceGame {
    static Player p1;
    static Player p2;
    static Die d1;
    static Die d2;

    public static void main(String[] args) throws Exception {
        // Instantiates 2 object of class Player and of class Die
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        d1 = new Die();
        d2 = new Die();
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        // The game starts
        System.out.println("Welcome to the Dice Game");
        Player currentPlayer = p1;
        var turn = 1;
        // When a player wins, the while loop stops running
        while (!winCheck(currentPlayer)) {
            // Set currentplayer depending on turn
            currentPlayer = turn % 2 == 0 ? p2 : p1;
            System.out.print("\n" + currentPlayer.getName() + "'s turn, press ENTER to roll the dice");
            scanner.nextLine();

            d1.roll();
            d2.roll();
            // Current player gets points
            currentPlayer.addPoints(getSum(d1, d2));
            System.out.println("You rolled " + d1.getFaceValue() + " and " + d2.getFaceValue() + ", you now have "
                    + currentPlayer.getPoints() + " points");
            turn++;
        }
        scanner.close();

        // Congratulates the winner, when the game ends
        System.out.println("\nCongratulations " + currentPlayer.getName() + ", you won the game!");
    }

    // Method to get the sum of the two dice thrown this turn
    private static int getSum(Die d1, Die d2) {
        return (d1.getFaceValue() + d2.getFaceValue());
    }

    // method to check if the to dice in this throw is equal
    private boolean getEqual(Die d1, Die d2) {
        return d1 == d2;
    }

    // Checks wthether a player has won the game
    private static boolean winCheck(Player currentPlayer) {
        return currentPlayer.getPoints() >= 40;
    }
}
