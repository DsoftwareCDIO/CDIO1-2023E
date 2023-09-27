package game.main;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Die {
    // Init list to store values of rolls in
    private List<Integer> rolls = new ArrayList<>();

    public void roll() {
        // Init random
        Random random = new Random();
        // Get random num between 0 (inclusive) and 6 (exclusive), adds 1 to get range
        // for 6-sided die
        rolls.add(random.nextInt(6) + 1);
    }

    // Method to get the previous rolls value
    public int preRoll() {
        return (rolls.get(rolls.size() - 2));
    }

    // Method to get the value of the roll just made
    public int getFaceValue() {
        return (rolls.get(rolls.size() - 1));
    }
}
