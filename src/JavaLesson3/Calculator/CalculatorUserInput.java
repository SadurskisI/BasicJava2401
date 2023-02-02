package JavaLesson3.Calculator;

public class CalculatorUserInput {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        CalculatorOperations calculatorOperations = new CalculatorOperations();

/*        System.out.println("Please enter first integer number - ");
        int x = userInput.userInputInt();
        System.out.println("Please enter second integer number - ");
        int y = userInput.userInputInt();
        int sumOfNum = calculatorOperations.sum(x,y);
        System.out.println("Sum of your number is - " + sumOfNum);
*/
        System.out.println("Please enter first double number - ");
        double xDouble = userInput.userInputDouble();
        System.out.println("Please enter second double number - ");
        double yDouble = userInput.userInputDouble();
        double divOfNumDouble = calculatorOperations.divDoubleParameters(xDouble,yDouble);
        System.out.println("Result of division of your number is - " + divOfNumDouble);

    }
}
