package javaLesson3.calculator;

public class UserInputInterface {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        System.out.println("Please enter integer number - ");
        int userEnterInt = userInput.userInputInt();

        System.out.println("Your number is " + userEnterInt);

        System.out.println("Please enter double number - ");
        double userEnterDouble = userInput.userInputDouble();

        System.out.println("Your number is " + userEnterDouble);

        System.out.println("Please enter text message - ");
        String userEnterText = userInput.userInputText();

        System.out.println("Your text is " + userEnterText);
    }
}
