package javaHomework240123.homeWork2;


import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int floor = 200;
        int stepUp = 50;
        int stepDown = 1;
        int nextFloor = 0;
        int i = 0;

        for (i = 0; i < floor; i++) {
            i = stepUp - stepDown;
            nextFloor = i + stepUp - stepDown;
        }
        System.out.println(i);
    }
}