package game;
import java.util.Random;

public class Die {
    public static int Dice() {
        // init random
        Random random = new Random();
        // add a random value to an int
        int value = random.nextInt(1, 6);
        // return the int "value"
        return (value);
    }

    public static void main(String[] args) {
        // temp. test to see if the dice mechanic works
        System.out.println(Dice());
    }
}
