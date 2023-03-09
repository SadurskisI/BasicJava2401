package javaHomework240123.homeWork5;


import java.util.Arrays;

public class LotteryDemo {

    public static void main(String[] args) {

        LotteryMethod.setRandomValue();
        System.out.println("Win numbers: " + Arrays.toString(LotteryMethod.winNumbers));
        int[] userNumbers = UserInput.getUserNum("Please enter your 5 numbers from your lottery ticket (from 1 to 50):");
        int[] matchNumbers = LotteryMethod.checkWinningNumbers(userNumbers);
        LotteryMethod.printMatchNumbers(matchNumbers);

    }

}
