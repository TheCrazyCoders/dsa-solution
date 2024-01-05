package DSAPractice.com.Arrays;

public class PrintSubArrays {
    public static void printSubArrays(int[] arr){
        int totalSubArray = 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j< arr.length;j++){
                int end = j;
                for(int k = start;k <=end;k++){ //for print
                    System.out.print(arr[k]); //SubArray
                    totalSubArray++;
                }

                System.out.println();
            }
        }
        System.out.println("total subarray :" +totalSubArray);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printSubArrays(arr);
    }
}
