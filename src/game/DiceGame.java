package game;

public class DiceGame {
    static Player p1;
    static Player p2;

    // static Die d1;
    // static Die d2;
    public static void main(String[] args) throws Exception {
        p1 = new Player();
        p2 = new Player();
        // d1 = new Die();
        // d2 = new Die();

        Player currentPlayer = p1;
        var turn = 1;
        while (/* !winCheck() */true) {
            currentPlayer = turn % 2 == 0 ? p2 : p1;
            // d1.roll();
            // d2.roll();
            // Spiller får point
            // Skifter tur
            turn++;
        }
    }

    // method to get the sum of the two dice thowed this turn
    private int getSum(Die d1, Die d2) {
        return (d1.getFaceValue() + d2.getFaceValue());
    }
    // method to check if the to dice in this throw id equal
    // private boolean getEqual(){

    // }
}
