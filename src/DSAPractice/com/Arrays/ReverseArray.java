package DSAPractice.com.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,8, 6,5};

        int start = 0;
        int end =arr.length - 1;
        int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("\nReversed Array:");
        //for each loop is alternate
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
