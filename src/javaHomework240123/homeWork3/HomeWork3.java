package javaHomework240123.homeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        int[] workingArray = new int[10];

        System.out.println("Regularity array number 1---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray1 = i * 2;
            workingArray[i - 1] = regularityArray1;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 2---");
        for (int i = 0; i < workingArray.length; i++) {
            int regularityArray2 = 1 + (i * 2);
            workingArray[i] = regularityArray2;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 3---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray3 = i * i;
            workingArray[i - 1] = regularityArray3;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 4---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray4 = i * i * i;
            workingArray[i - 1] = regularityArray4;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 5---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray5 = (int) Math.pow(-1, i + 1);
            workingArray[i - 1] = regularityArray5;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 6---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray6 = (int) Math.pow(-1, i + 1) * i;
            workingArray[i - 1] = regularityArray6;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 7---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray7 = (int) Math.pow(-1, i + 1) * i * i;
            workingArray[i - 1] = regularityArray7;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        System.out.println("Regularity array number 8---");
        for (int i = 1; i <= workingArray.length; i++) {
            int regularityArray8;
                if (i % 2 == 0) {
                regularityArray8 = 0;
                } else {
                regularityArray8 = (i + 1) / 2;
                }
            workingArray[i - 1] = regularityArray8;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        int regularityArray9 = 1;
        System.out.println("Regularity array number 9---");
        for (int i = 1; i <= workingArray.length; i++) {
            regularityArray9 *= i;
            workingArray[i - 1] = regularityArray9;
        }
        System.out.println(Arrays.toString(workingArray));
////////
        int tmpRegularity1 = 1;
        int tmpRegularity2 = 1;
        System.out.println("Regularity array number 10---");
        for (int i = 3; i <= workingArray.length; i++) {
            int regularityArray10 = tmpRegularity1 + tmpRegularity2;
            tmpRegularity1 = tmpRegularity2;
            tmpRegularity2 = regularityArray10;
            workingArray[i - 1] = regularityArray10;
            workingArray [1] = 1; // закономерность получалась верной, но печему то индекс [1] был 2 вместо 1
        }
        System.out.println(Arrays.toString(workingArray));
    }
}


