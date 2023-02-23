package javaHomework240123.homeWork3;


public class HomeWork4 {
    public static void main(String[] args) {
        int[] randomNumbersArray = HomeWork4Method.crateRandomNumbersArray(30);

        System.out.println("Max element is - " + HomeWork4Method.maxElement(randomNumbersArray));
        System.out.println("Min element is - " + HomeWork4Method.minElement(randomNumbersArray));
        System.out.println("Middle arifmetic is - " + HomeWork4Method.midArifmetic(randomNumbersArray));
        System.out.println("Differance between elements is - " + HomeWork4Method.differenceBetweenMinAndMaxElement(randomNumbersArray));
        System.out.println("First prime number is - " + HomeWork4Method.FirstPrimeNumber(randomNumbersArray));
        System.out.println("Last prime number is - " + HomeWork4Method.lastPrimeNumber(randomNumbersArray));
        System.out.println("Prime number count is - " + HomeWork4Method.primeNumberCounter(randomNumbersArray));

    }
}
