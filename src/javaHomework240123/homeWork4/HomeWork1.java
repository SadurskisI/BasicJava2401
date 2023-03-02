package javaHomework240123.homeWork4;


public class HomeWork1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0, 7, 8, 9, 10}; // Missing number is 6
        int missingNumber = HomeWork1Method.findMissing(array); // call find method
        System.out.println("Missing number - " + missingNumber); // check result

    }
}
