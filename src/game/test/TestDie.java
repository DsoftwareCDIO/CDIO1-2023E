package game.test;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class TestDie {
    // Init list to store values of rolls in
    private List<Integer> rolls = new ArrayList<>();

    public void roll() {
        rolls.add(6);
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
