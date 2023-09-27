package game.test;
import game.main.Player;

import org.junit.Test;

public class Two6sWinCondition {
    @Test
    public void testTwo6sWinCondition(){
        TestDie d1 = new TestDie();
        TestDie d2 = new TestDie();
        d1.roll();
        d2.roll();
        System.out.println(d1.getFaceValue() + " " + d2.getFaceValue());
        d1.roll();
        d2.roll();
        System.out.println(d1.getFaceValue() + " " + d2.getFaceValue());
        System.out.println(TestDiceGame.winCheck(new Player(""), d1, d2));
    }
}
