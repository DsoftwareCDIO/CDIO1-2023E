package game;

public class DiceGame {
    static Player p1;
    static Player p2;
    public static void main(String[] args) throws Exception {
        p1 = new Player();
        p2 = new Player();

        Player currentPlayer = p1;
        var turn = 1;
        while (/* !winCheck() */true) {
            currentPlayer = turn % 2 == 0 ? p2 : p1;
            turn++;
        }
    }

    private int getSum(Die d1, Die d2){
        return(d1.getFaceValue + d2.getFaceValue);
    }
}
