package DSAPractice.com.Arrays;

public class PairsInArray {

    public static void printPairs(int[] numbers){
        int totalPair = 0;
       for(int i=0; i<numbers.length;i++){
           for (int j=i+1;j<numbers.length;j++){
               System.out.print("(" +numbers[i] +","+numbers[j] +")");
               totalPair++;
           }
           System.out.println();
       }
       //formula for total number of pairs: n(n-1)/2
        System.out.println("total pair:" +totalPair);
    }

    public static void main(String[] args){
        int[] numbers = {1,4,2,6,3};
        printPairs(numbers);

    }
}
