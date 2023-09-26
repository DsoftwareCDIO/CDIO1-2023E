package game;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Die {
    // init list to store values of rolls in
    List<Integer> rolls = new ArrayList();

    public void roll() {
        // init random
        Random random = new Random();
        // get random num between 0 (inclusive) and 6 (exclusive), adds 1 to get range
        // for 6-sided die
        rolls.add(random.nextInt(6) + 1);
    }

    // method to get the previous rolls value
    public int preRoll() {
        return (rolls.get(rolls.size() - 2));
    }

    // method to get the value of the roll just made
    public int getFaceValue() {
        return (rolls.get(rolls.size() - 1));
    }
}
