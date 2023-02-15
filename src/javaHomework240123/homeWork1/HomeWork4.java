package javaHomework240123.homeWork1;

import java.util.Scanner;


public class HomeWork4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println("Результат сложения: " + HomeWork4Method.sum(a,b));
        System.out.println("Результат вычитания: " + HomeWork4Method.minus(a,b));
        System.out.println("Результат умножения: " + HomeWork4Method.multi(a,b));
        System.out.println("Результат деления: " + HomeWork4Method.div(a,b));

    }
}
