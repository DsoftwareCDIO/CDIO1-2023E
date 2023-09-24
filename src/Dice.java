import java.util.Random;

public class Dice {
    public static int Dice() {
        Random random = new Random();
        int value = random.nextInt(1, 6);
        return (value);
    }

    public static void main(String[] args) {
        System.out.println(Dice());
    }
}
