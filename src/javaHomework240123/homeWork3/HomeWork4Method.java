package javaHomework240123.homeWork3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork4Method {
    static Random random = new Random();

    public static int[] crateRandomNumbersArray(int arraySize) {
        int[] randomNumbersArray = new int[arraySize];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(randomNumbersArray));
        return randomNumbersArray;
    }

    public static int maxElement(int[] workingArray) {
        int max = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > max)
                max = workingArray[i];
        }
        return max;
    }

    public static int minElement(int[] workingArray) {
        int min = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] < min)
                min = workingArray[i];
        }
        return min;
    }

    public static int midArifmetic(int[] workingArray) {
        int summ = 0;
        for (int i = 0; i < workingArray.length; i++) {
            summ += workingArray[i];
        }
        return summ / workingArray.length;
    }

    public static int differenceBetweenMinAndMaxElement(int[] workingArray) {
        int maximumNumber = 1;
        int maximumNumberIndex = 0;
        int minimumNumber = 99;
        int minimumNumberIndex = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > maximumNumber) {
                maximumNumber = workingArray[i];
                maximumNumberIndex = i;
            }
            if (workingArray[i] < minimumNumber) {
                minimumNumber = workingArray[i];
                minimumNumberIndex = i;
            }
        }return Math.abs(maximumNumberIndex - minimumNumberIndex);
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0){
                isPrime = false;
            }
        }return isPrime;
    }

    public static int FirstPrimeNumber(int[] workingArray){
        int firstPrimeNumber = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (isPrime(workingArray[i])){
                firstPrimeNumber = workingArray[i];
                break;
            }
        }return firstPrimeNumber;
    }

    public static int lastPrimeNumber(int[] workingArray){
        int lastPrimeNumber = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (isPrime(workingArray[i])){
                lastPrimeNumber = workingArray[i];
            }
        }return lastPrimeNumber;
    }

    public static int primeNumberCounter(int[] workingArray){
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (isPrime(workingArray[i])){
                counter++;
            }
        }return counter;
    }
}