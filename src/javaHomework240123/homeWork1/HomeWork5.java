package javaHomework240123.homeWork1;

import java.util.Scanner;

public class HomeWork5 {

      public static void main(String[] args) {
        System.out.println("Пожалуйста введите количество EURO");
        Scanner scanner = new Scanner(System.in);
        double euro = scanner.nextDouble();
        System.out.println("Это будет - " + HomeWork5Method.multiply(euro) + " долларов" );




    }
}
