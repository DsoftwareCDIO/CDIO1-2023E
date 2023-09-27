package game.main;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        // The game starts
        System.out.println("Welcome to the Dice Game");
        Player currentPlayer = p1;
        int turn = 1;
        // When a player wins, the while loop stops running
        while (!winCheck(currentPlayer)) {
            // Set currentplayer depending on turn
            currentPlayer = turn % 2 == 0 ? p2 : p1;
            System.out.print("\n" + currentPlayer.getName() + "'s turn, press ENTER to roll the dice");
            scanner.nextLine();

            d1.roll();
            d2.roll();
            // Checks if roll is double ones and current player gets points
            if (getSum(d1, d2) == 2){
                currentPlayer.resetPoints();
                System.out.println("You rolled double ones. You now have " + currentPlayer.getPoints() + " points");
            } else {
                currentPlayer.addPoints(getSum(d1, d2));
                System.out.println("You rolled " + d1.getFaceValue() + " and " + d2.getFaceValue() + ", you now have "
                    + currentPlayer.getPoints() + " points");
            }

            if (getEqual(d1, d2)) {
                turn--;
                System.out.println("You rolled two of a kind, so you get an extra turn");
            }
            turn++;
        }

        // Congratulates the winner, when the game ends
        System.out.println("\nCongratulations " + currentPlayer.getName() + ", you won the game!");
        scanner.nextLine();
        scanner.close();
    }

    // Method to get the sum of the two dice thrown this turn
    private static int getSum(Die d1, Die d2) {
        return (d1.getFaceValue() + d2.getFaceValue());
    }

    // Checks whether a player has won the game
    private static boolean winCheck(Player currentPlayer) {
        return currentPlayer.getPoints() >= 40;
    }
    // method to check if the to dice in this throw is equal
    private static boolean getEqual(Die d1, Die d2) {
        return d1.getFaceValue() == d2.getFaceValue();
    }

    // Checks wthether a player has won the game
    private static boolean winCheck(Player currentPlayer, Die d1, Die d2) {
        return (currentPlayer.getPoints() >= 40 && getEqual(d1, d2));
    }
}
