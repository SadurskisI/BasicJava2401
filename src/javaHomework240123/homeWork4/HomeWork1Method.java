package javaHomework240123.homeWork4;


public class HomeWork1Method {
    public static int findMissing(int[] array){
        int actualSum = 0;
        int expectedSum = array.length * (array.length + 1) / 2;

        // method to check missing number in array of primitive integers
        for (int number : array) {
            actualSum += number;
        }
        return  expectedSum - actualSum;
    }
}

