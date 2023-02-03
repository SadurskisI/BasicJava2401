package JavaHomework240123.HomeWork1.HomeWork4;

import java.util.Scanner;

import static JavaHomework240123.HomeWork1.HomeWork4.HomeWork4Method.*;
import static java.lang.Integer.sum;


public class HomeWork4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Результат сложения: " + sum(a, b));
        System.out.println("Результат вычитания: " + minus(a, b));
        System.out.println("Результат умножения: " + multi(a, b));
        System.out.println("Результат деления: " + div(a, b));

    }
}
