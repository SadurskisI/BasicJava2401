package javaHomework240123.homeWork3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[8];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(1, 50);
        }
            System.out.println("Integer random number array - " + Arrays.toString(intArray));

        for (int j = 0; j < intArray.length ; j++) {
            if (j % 2 == 0) {
                intArray[j] = 0;
            }
        }
        System.out.println("Second integer random number array with odd index 0 - " + Arrays.toString(intArray));
    }
}

