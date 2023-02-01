package JavaLesson3.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperations calculatorOperations = new CalculatorOperations();
        int a = 5;
        int b = 10;

        int resultOfSum = calculatorOperations.sum(a,b);

        System.out.println(resultOfSum);

        int resultOfSubstruction = calculatorOperations.minus(55,15);
        int resultOfSubstraction2 = calculatorOperations.minus(a,b);
        System.out.println(resultOfSubstruction);
        System.out.println(resultOfSubstraction2);

        int resultOfMultiplication = calculatorOperations.multiplication(a,b);
        System.out.println(resultOfMultiplication);

        double resultOfDiv = calculatorOperations.div(a,b);
        System.out.println(resultOfDiv);

    }
}
