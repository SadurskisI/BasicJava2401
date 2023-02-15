package javaHomework240123.homeWork1;
import java.util.Scanner;
import java.lang.Math;

public class HomeWork6 {

    public static void main(String[] args) {
        // S = d^2/4*pi
        // S = piR^2


        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите пожалуйста диаметр первой пицци что бы рассчитаь каллории - ");
        double diametr1 = scanner.nextDouble();

        double rPizza1 = diametr1/2;
        double r2Pizza1 = rPizza1*rPizza1;
        double sPizza1 = (Math.PI * r2Pizza1);
        double pizza1Cal = sPizza1 * 40;
        System.out.println("Количество каллорий первой пицци - " + pizza1Cal);

        System.out.println("Укажите пожалуйста диаметр второй пицци - ");
        double diametr2 = scanner.nextDouble();
        double rPizza2 = diametr2/2;
        double r2Pizza2 = rPizza2 * rPizza2;
        double sPizza2 = Math.PI * r2Pizza2;
        double pizza2Cal = sPizza2 * 40;
        System.out.println("Количество каллорий второй пиццы - " +pizza2Cal);
        System.out.println("Разницы каллорий между пиццами - " + (pizza2Cal - pizza1Cal));


    }
}
