package game;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Die {
    List<Integer> rolls = new ArrayList();

    public void roll() {
        // init random
        Random random = new Random();
        rolls.add(random.nextInt(1, 7));
    }

    public int preRoll() {
        return (rolls.get(rolls.size() - 2));
    }

    public int getFaceValue() {
        return (rolls.get(rolls.size() - 1));
    }
}
