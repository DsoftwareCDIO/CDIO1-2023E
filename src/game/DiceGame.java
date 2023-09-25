package game;

public class DiceGame {
    static Player p1;
    static Player p2;
    static Die d1;
    static Die d2;
    public static void main(String[] args) throws Exception {
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        d1 = new Die();
        d2 = new Die();
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        //Game I/O
        System.out.println("Velkommen til terningespillet");
        Player currentPlayer = p1;
        var turn = 1;
        while (!winCheck(currentPlayer)) {
            currentPlayer = turn % 2 == 0 ? p2 : p1;
            System.out.println(currentPlayer.getName() + " har turen, tryk ENTER for at slå med terningerne");
            scanner.nextLine();
            d1.roll();
            d2.roll();
            //Spiller får point
            //Skifter tur
            System.out.println("Der blev slået " + d1.getFaceValue() + " og " + d2.getFaceValue() + ", du har nu " + currentPlayer.getPoints() + " point");
            turn++;
        }
        
        //System.out.println("Tillykke " + currentPlayer.getName() + ", du har vundet spillet!");

        
    }

    // method to get the sum of the two dice thowed this turn
    private int getSum(Die d1, Die d2) {
        return (d1.getFaceValue() + d2.getFaceValue());
    }
    // method to check if the to dice in this throw id equal
    // private boolean getEqual(){

    // }
  
    private static boolean winCheck(Player currentPlayer){
        return currentPlayer.getPoints() >= 40;
    }
}
