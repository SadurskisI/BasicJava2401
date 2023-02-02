package AdditionalWork;
import java.util.Scanner;

public class Add1 {
    public static void main(String[] args) {
   /*     Написать консольную программу, которая запрашивает у пользователя два вещественных числа
        (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
        Вещественные числа можно запрашивать с консоли используя обьект Scanner
       следующим образом:
   */
        System.out.println("Please enter your first double number");

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Your first double number is - " + firstDoubleNumber);

        System.out.println("Please enter your second double number");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Your second double number - " + secondDoubleNumber);

        double sum = firstDoubleNumber + secondDoubleNumber;
        double minus = firstDoubleNumber - secondDoubleNumber;
        double multi = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum result is - " + sum);
        System.out.println("Minus result is - " + minus);
        System.out.println("Multi result is - " + multi);
        System.out.println("Div result is - " + div);
    }
}
