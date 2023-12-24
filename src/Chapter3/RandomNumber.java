package Chapter3;

import java.util.Random;

public class RandomNumber {
    public static void main(String args[]) {
        Random random = new Random(); // creating an object of Random class
        int x = random.nextInt(50) + 1; // generates random integers 1 to 50
        System.out.println("Randomly Generated Integers Values: " + x);

        double a = random.nextDouble(); // generates Random doubles values
        System.out.println("Randomly Generated Double Values: " + a);

        float f = random.nextFloat();
        System.out.println("Randomly Generated Float Values: " + f);
    }
}

