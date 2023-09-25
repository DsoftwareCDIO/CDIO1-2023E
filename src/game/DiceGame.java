package game;
public class DiceGame {
    static Player p1;
    static Player p2;
    static Die d1;
    static Die d2;
    public static void main(String[] args) throws Exception {
        p1 = new Player();
        p2 = new Player();
        d1 = new Die();
        d2 = new Die();
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        //Game I/O
        System.out.println("Velkommen til terningespillet");
        Player currentPlayer = p1;
        var turn = 1;
        while (/*!winCheck()*/true){
            currentPlayer = turn % 2 == 0 ? p2 : p1;
            System.out.println("Player " + currentPlayer.getName() + " har turen, tryk ENTER for at slå med terningerne");
            scanner.nextLine();
            //d1.roll();
            //d2.roll();
            //Spiller får point
            //Skifter tur
            System.out.println("Der blev slået " + d1.getFaceValue() + " og " + d2.getFaceValue() + ", du har nu " + currentPlayer.getPoints() + " point");
            turn++;
        }
        
        System.out.println("Tillykke " + currentPlayer.getName() + ", du har vundet spillet!");

        
    }
}
