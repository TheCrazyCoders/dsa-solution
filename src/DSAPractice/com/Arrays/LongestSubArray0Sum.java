package DSAPractice.com.Arrays;
//Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray0Sum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int maxSum = largestSumWithZeroSum(arr);
        System.out.println(maxSum);

    }

    public static int largestSumWithZeroSum(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum=0;
        int ans =0;
        for(int i=0;i<arr.length;i++){
            prefixSum+= arr[i];
            map.put(prefixSum,arr[i]);
            if(map.containsKey(prefixSum)){
                ans = i;
            }
            return ans;
        }
        return ans;

    }
}
///not solved, try again