package game.test;
import game.main.Die;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
public class ThousandDiceRolls {
    @Test
    public void rollDice() {
        int sum = 0, similar = 0;
        List<Integer> rolls = new ArrayList<>();
        Die d1 = new Die();
        Die d2 = new Die();
        for (int i = 0; i < 1000; i++) {
            d1.roll();
            sum += d1.getFaceValue();
            d2.roll();
            sum += d2.getFaceValue();
            rolls.add(d1.getFaceValue());
            rolls.add(d2.getFaceValue());
            if (d1.getFaceValue() == d2.getFaceValue()) {
                similar++;
            }
        }

        System.out.println("1's: " + Collections.frequency(rolls, 1));
        System.out.println("2's: " + Collections.frequency(rolls, 2));
        System.out.println("3's: " + Collections.frequency(rolls, 3));
        System.out.println("4's: " + Collections.frequency(rolls, 4));
        System.out.println("5's: " + Collections.frequency(rolls, 5));
        System.out.println("6's: " + Collections.frequency(rolls, 6));
        System.out.println("Two equal: "+similar);
        System.out.println("Median: " + sum/1000.0);
    }
}
