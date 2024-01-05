package DSAPractice.com.Arrays;
public class SumOfSubArray {

    public static void findSumAndMax(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        System.out.println("Sum of all subarrays:");

        // Outer loop for starting index of subarray
        for (int start = 0; start < n; start++) {
            // Inner loop for ending index of subarray
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                // Calculate sum of current subarray
                currentSum += arr[end];

                // Print the sum of the current subarray
                System.out.print(currentSum + " ");

                // Update the maximum sum
                maxSum = Math.max(maxSum, currentSum);
                minSum = Math.min(minSum, currentSum);
            }
        }

        System.out.println("\nMaximum sum of subarrays: " + maxSum);
        System.out.println("\nMinimum sum of subarray: " + minSum);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        findSumAndMax(array);
    }
}
