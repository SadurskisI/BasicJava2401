package javaHomework240123.homeWork3;

public class HomeWork2Method {
    public static boolean isSorted(int[] intArray) {
        if (intArray == null || intArray.length <= 1) {
            return true;
        }
        for (int j = 0; j < intArray.length - 1; j++) {
            if (intArray[j] > intArray[j + 1]) {
                return false;
            }
        }
        return true;
    }
}