package javaHomework240123.homeWork4;

public class HomeWork2Method {
    public static int findPairs(int[] array, int k) {
        int count = 0; // pair counter
        int left = 0; // array start point
        int right = array.length - 1; // array start point from end

        // check method to find pair number which gave us K(summ of pair)
        // counter elements, return counter how much pair we have.
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
