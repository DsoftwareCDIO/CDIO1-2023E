package game.test;

import java.util.Scanner;

import org.junit.Test;

import game.main.Die;

public class TestFeedbackSpeed {
    @Test
    public void rollSpeedTest(){
        Die d1 = new Die();
        Die d2 = new Die();
        final long startTime = System.currentTimeMillis();
        d1.roll();
        d2.roll();
        System.out.println("You rolled " + d1.getFaceValue() + " and " + d2.getFaceValue());
        final long endTime = System.currentTimeMillis();
        
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
