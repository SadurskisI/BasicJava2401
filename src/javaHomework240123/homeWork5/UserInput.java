package javaHomework240123.homeWork5;

import java.util.Scanner;

public class UserInput {

    public static int[] getUserNum(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[5];
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] =  scanner.nextInt();
        }
        return userNumbers;
    }
}

