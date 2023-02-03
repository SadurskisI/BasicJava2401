package JavaHomework240123.HomeWork1.homeWork4;

import java.util.Scanner;


public class HomeWork4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Результат сложения: " + HomeWork4Method.sum(a, b));
        System.out.println("Результат вычитания: " + HomeWork4Method.minus(a, b));
        System.out.println("Результат умножения: " + HomeWork4Method.multi(a, b));
        System.out.println("Результат деления: " + HomeWork4Method.div(a, b));

    }
}
