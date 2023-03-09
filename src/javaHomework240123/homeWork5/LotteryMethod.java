package javaHomework240123.homeWork5;

import java.util.Arrays;
import java.util.Random;

public class LotteryMethod {
    static Random random = new Random();
    static int[] winNumbers = new int[5];
    public static int getRandomValue() {
        int max = 50;
        int min = 1;
        return random.nextInt(max) + min;
    }

    public static void setRandomValue() {
        for (int i = 0; i < winNumbers.length; i++) {
            winNumbers[i] = getRandomValue();
        }
        Arrays.sort(winNumbers);
        for (int j = 1; j < winNumbers.length; j++) {
            if (winNumbers[j] == winNumbers[j - 1]) {
                winNumbers[j] = getRandomValue();
            }
        }
    }

    public static int[] checkWinningNumbers(int[] userNumbers) {
        int counter = 0;
        int[] match = new int[userNumbers.length];
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < winNumbers.length; j++) {
                if (userNumbers[i] == winNumbers[j]) {
                    match[counter] = userNumbers[i];
                    counter++;
                }
            }
        }
        return match;
    }

    public static void printMatchNumbers(int[] matchNumbers) {
        int sum = 0;
        String message = "";
        StringBuilder winNumbersList = new StringBuilder();
        for (int i = 0; i < matchNumbers.length; i++) {
            sum = sum + matchNumbers[i];
            if (sum != 0) {
                message = "Win numbers from your ticket: ";
            }
            if (sum == 0) {
                message = "There are no win numbers in your ticket.";
            }
            if (matchNumbers[i] != 0) {
                winNumbersList.append(matchNumbers[i]).append(" ");
            }
        }
        System.out.println(message + winNumbersList);
    }
}
