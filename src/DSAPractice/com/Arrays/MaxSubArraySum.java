package DSAPractice.com.Arrays;

public class MaxSubArraySum {
    public static void printMaxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        /*for(int i= 0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.print(currSum + " ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }*/
            for(int i= 0;i<arr.length;i++){
                currSum += arr[i];

                // System.out.print( currSum +" ");
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                if(currSum<0){
                    currSum = 0;
                }

            }

        System.out.println("Max Sum:" +maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        printMaxSubarraySum(arr);

    }
}
