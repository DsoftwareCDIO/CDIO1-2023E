package game.test;
import game.main.Die;

import org.junit.Test;
public class ThousandDiceRolls {
    @Test
    public void RollDice() {
        int sum = 0;
        Die d1 = new Die();
        Die d2 = new Die();
        for (int i = 0; i < 1000; i++) {
            d1.roll();
            sum += d1.getFaceValue();
            d2.roll();
            sum += d2.getFaceValue();
            System.out.println(d1.getFaceValue() + " " + d2.getFaceValue());
        }

        System.out.println("Median: " + sum/1000.0);
    }
}
