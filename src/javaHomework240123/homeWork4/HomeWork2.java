package javaHomework240123.homeWork4;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // working array of 10 numbers
        int k = 10; // Number to find summ of pairs
        int pairsFinder = HomeWork2Method.findPairs(array, k); // Call method from class
        System.out.println("Number of pairs is " + pairsFinder); // Check result

    }
}



