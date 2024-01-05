package DSAPractice.com.Arrays;

public class DuplicatesInArray {
    public static void printDuplicates(int[] arr) {
        System.out.println("Duplicates in the array:");

        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break; // Break to avoid printing the same duplicate multiple times
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 1,1,1};
        printDuplicates(arr);
    }
}
