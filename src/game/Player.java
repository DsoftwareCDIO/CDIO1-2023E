package game;
public class Player {
    private int points;
    private String name;

    // Constructor, where player name is given, only given as Player 1 and Player 2 for now
    public Player(String name){
        this.name = name;
    }

    // Get players points
    public int getPoints(){
        return points;
    }
    
    // Add to players points
    public void addPoints(int points){
        this.points += points;
    }

    // Get name of player for game output
    public String getName(){
        return name;
    }
}
