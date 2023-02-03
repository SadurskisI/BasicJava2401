package JavaHomework240123.HomeWork1;

import java.util.Scanner;

public class HomeWork5 {
    //////////////Первый вариант - курс доллара берёт из кода
    /*  public static void main(String[] args) {
        System.out.println("Пожалуйста введите количество EURO");
        Scanner scanner = new Scanner(System.in);
        double euro = scanner.nextInt();
        double dollar = euro * 1.09;
        System.out.println("Это будет - " + dollar + " долларов" );
*/
    ///////////////// Второй вариант - когда актуальный курс вводит пользователь
        public static void main(String[] args) {
            System.out.println("Пожалуйста введите количество EURO");
            Scanner scanner = new Scanner(System.in);
            double euro = scanner.nextDouble();
            System.out.println("Теперь ввидите актуальный курс доллара");
            double dollarValue = scanner.nextDouble();
            double dollar = euro * dollarValue;
            System.out.println("Это будет - " + dollar + " долларов" );


    }
}
