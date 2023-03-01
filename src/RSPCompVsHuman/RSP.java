package RSPCompVsHuman;

import javaLesson4.stringOperation.StringOparations;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 240123IS
 * @version 1.0
 */

public class RSP {
    /*
    Задача
    Реализовать игру "Камень, ножницы, бумага" в версии
    человек против компьютера
     */
    /*
    Теория
    Главный цикл приложения - это цикл функционирования программы,
    он будет исполняться пока не булет получена команда от пользователя
    на заверщения работы, как правило, огромное количество задач
     */
    /*
    Решение
    1) Реализовать генерацию случайных чисел
    и присвоить числу от 1 до 3 строку,
    которая будет ходом компьютера
    2)Реализовать считывания хода человека
    3)Реализовать метод для проверки победителя
    4)Реализовать главный цикл преложения
     */
    static Random random = new Random(); // Объект класса Random
    static Scanner scanner = new Scanner(System.in); // Объект класса Scanner
    final static String WRONG_INPUT = "Your input is wrong. ";

    public static void main(String[] args) { // точка входа, от сюда начинается любой джава программы

        while (true) {
            System.out.println(checkWinner(makeComputerMove(), makePlayerMove()));
            if (isEndGame()) {
                break;
            }
        }
    }
    public static boolean isEndGame() {
        char ch = ' ';
        while (true) {
            System.out.println("Would you like to end the game?\n " +
                    "y - yes\n" +
                    " n - no");
            ch = scanner.nextLine().charAt(0);
            if (ch == 'y' || ch == 'n') {
                break;
            }
            else{
                System.out.println(WRONG_INPUT);
        }
    }
        if (ch == 'y'){
            return true;
        }
        else
            return false;

    }

    public static String makeComputerMove() {
        int rand = random.nextInt(3) + 1;
        String compMove = "";
        if (rand == 1) {
            compMove = "Rock";
        }
        if (rand == 2) {
            compMove = "Scissors";
        }
        if (rand == 3) {
            compMove = "Paper";
        }
        return compMove;
    }

    public static String makePlayerMove() {
        String move = "";
        while (true) {
            System.out.println("Make your move: ");
            move = scanner.nextLine();
            if (isRightMove(move)) {
                break;
            }
            else {
                System.out.println(WRONG_INPUT);
            }
        }return move;
    }

    private static boolean isRightMove(String move) {
        if(!move.equals("Scissors") && !move.equals("Rock") && !move.equals("Paper")){
            return false;
        }
        else
            return true;
    }

    public static String checkWinner(String comp, String player) {
        System.out.println("Computer move: " + comp + " Players move: " + player);
        if (comp.equals("Scissors") && player.equals("Paper")) {
            return "Computer win";
        } else if (comp.equals("Scissors") && player.equals("Rock")) {
            return "Player win";
        } else if (comp.equals("Rock") && player.equals("Paper")) {
            return "Player win";
        } else if (comp.equals("Rock") && player.equals("Scissors")) {
            return "Computer win";
        }
        if (comp.equals("Paper") && player.equals("Rock")) {
            return "Computer win";
        }
        if (comp.equals("Paper") && player.equals("Scissors")) {
            return "Player win";
        }
        return "Draw";

    }
}
