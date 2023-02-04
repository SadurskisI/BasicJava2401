package JavaHomework240123.HomeWork1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        int halfWord1 = word1.length() / 2;
        int halfWord2 = word2.length() / 2;
        String word3 = word1.substring(0, halfWord1) + word2.substring(halfWord2);
        System.out.println("Новое слово: " + word3);

    }
}


