package javaHomework240123.homeWork2;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first flask temperature - ");
        int temperature1 = scanner.nextInt();

        System.out.println("Please enter second flask temperature - ");
        int temperature2 = scanner.nextInt();

        boolean itWorks;

        if ((temperature1 > 100) && (temperature2<100)) {
            itWorks = true;
            System.out.println("Result is - " + itWorks);
        }else{
            itWorks = false;
            System.out.println("Result is - " + itWorks);
        }
    }
}