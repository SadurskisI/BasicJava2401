package JavaHomework240123.HomeWork1;

import java.util.Scanner;

public class HomeWork5 {
    //////////////Первый вариант - курс доллара берёт из кода
      public static void main(String[] args) {
        System.out.println("Пожалуйста введите количество EURO");
        Scanner scanner = new Scanner(System.in);
        double euro = scanner.nextDouble();
        double dollarCurs = 1.09;
        System.out.println("Это будет - " + HomeWork5Method.multiply(euro,dollarCurs) + " долларов" );




    }
}
