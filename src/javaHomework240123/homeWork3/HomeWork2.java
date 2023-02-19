package javaHomework240123.homeWork3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10,99);
        }
        System.out.println("Integer random number array - " + Arrays.toString(intArray));

        //--------Вариант для метода проверки сортировки-----------//
//        Arrays.sort(intArray);
//        System.out.println("Sorted integer array - " + Arrays.toString(intArray));
        System.out.println("Is array sorted - " + HomeWork2Method.isSorted(intArray));
        }
    }

