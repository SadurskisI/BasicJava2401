package JavaLesson3.Calculator;

public class CalculatorOperations {
    public int sum(int x, int y) {
        int sumOfBothParameters = x + y;
        return sumOfBothParameters;
    }

    public int minus(int parameter1, int parameter2) {
        int resultOfMinus = parameter1 - parameter2;
        return resultOfMinus;
    }

    public int multiplication(int parameter1, int parameter2) {
        int resultOfMultiplication = parameter1 * parameter2;
        return resultOfMultiplication;
    }

    public double div(int parameter1, int parameter2) {
        double resultOfDiv = parameter1 / (double) parameter2;
        return resultOfDiv;
    }
}
