package AdditionalWork;

import java.util.Scanner;

public class Add2 {
// Написать консольную программу, которая запрашивает
// имя пользователя и выводит на консоль текст:
    // Hello имя пользователя!

    public static void main(String[] args) {

        System.out.println("Please enter your username");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello " + username + "!");
    }
}
