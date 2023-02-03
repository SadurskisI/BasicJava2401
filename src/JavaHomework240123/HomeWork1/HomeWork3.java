package JavaHomework240123.HomeWork1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
/* Это при условии ввода слов пользователем//Вариант 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        int half = word1.length() / 2;
        String word3 = word1.substring(0, half) + word2.substring(half);
        System.out.println("Новое слово: " + word3);
  */
        //Вариант 2
        String word1 = "ГОГА";
        String word2 = "РОГА";
        int half = word1.length() / 2;
        String word3 = word1.substring(0, half) + word2.substring(half);
        System.out.println("Первое слово - "+ word1);
        System.out.println("Второе слово - "+ word2);
        System.out.println("Новое слово - " + word3);



    }
}


