package DSAPractice.com.Arrays;

import java.sql.Array;

public class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            //for(int i=0;i<2*n;i++){
            //ans[i] = nums[i%n];
            //i =1,2,3
            ans[i] = nums[i];
            //i=4,5,6 i.e i+3, i++
            ans[i+n] = nums[i];

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,3};
        int[] result = getConcatenation(nums);
        for(int s : result){
            System.out.print(s);
        }


    }
}
