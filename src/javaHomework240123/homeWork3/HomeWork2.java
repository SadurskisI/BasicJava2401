package javaHomework240123.homeWork3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {
    public static boolean isSorted (int[] intArray){
       if (intArray == null || intArray.length <= 1){
           return true;
       }
        for (int j = 0; j < intArray.length - 1; j++) {
            if (intArray[j] > intArray[j + 1]){
                return false;
            }
        }
        return true;
    }
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
        System.out.println("Is array sorted - " + HomeWork2.isSorted(intArray));
        }
    }

