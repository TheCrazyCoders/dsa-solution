package DSAPractice.com.Arrays;

public class LargestNumber {

    public static void main(String[] args){
         int[] num = {3,5,6,8,9,10,14,12,150,88};
         int largestNumber = largestNumber(num);
        System.out.println("The largest number is: " + largestNumber);
    }

    private static int largestNumber(int[] num) {
       int largestNum = num[0];
       for(int i =1;i <num.length; i++){
           if(num[i]>largestNum){
               largestNum = num[i];

           }
       }
        return largestNum;
    }
}
