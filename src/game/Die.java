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
        rolls.add(random.nextInt(1, 7));
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
