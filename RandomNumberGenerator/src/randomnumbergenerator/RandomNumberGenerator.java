package randomnumbergenerator;

import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Random dice = new Random();
        int number;

        for (int counter = 1; counter <= 10; counter++) {
            number = 1 + dice.nextInt(6); // <- 1+ before dice alow to startt from 1 insted of 0
            System.out.println(number + "  ");
        }
    }

}
