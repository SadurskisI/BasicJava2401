package javaHomework240123.homeWork2;


import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of floor - ");
        int floor = scanner.nextInt();
        System.out.println("Please enter number of step-ups - ");
        int stepUp = scanner.nextInt();
        System.out.println("Please enter number of step-down - ");
        int stepDown = scanner.nextInt();
        System.out.println("Your number of lifts is - " + numberOfLifts(floor, stepUp,stepDown));

    }
    public static int numberOfLifts(int floor,int stepUp,int stepDown){
        int nextFloor = 0;
        int i = 0;
        while (nextFloor <= floor) {
            nextFloor = nextFloor + stepUp - stepDown;
            i++;
        }return i;
    }
}