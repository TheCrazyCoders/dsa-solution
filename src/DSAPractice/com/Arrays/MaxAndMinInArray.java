package DSAPractice.com.Arrays;

public class MaxAndMinInArray {
    public static void printMaxAndMin(int[] arr) {
        // Check if the array is not empty
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        System.out.println("Max no in an Array is: " + max);
        System.out.println("Min no in an Array is: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 15, 10, 19, 25, 13, 70};
        printMaxAndMin(arr);
    }
}
