package JavaLesson3.Calculator;

import java.util.Scanner;

public class UserInput {

    public int userInputInt(){
        Scanner scanner = new Scanner(System.in);
        int intInput = scanner.nextInt();
        return intInput;
    }
    public double userInputDouble() {
        Scanner scanner = new Scanner(System.in);
        double doubleInput = scanner.nextDouble();
        return doubleInput;
    }
    public String userInputText() {
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
        return textInput;
    }
}
