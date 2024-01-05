package DSAPractice.com.HashMaps;

import java.util.HashMap;

public class SubarraySumEqToK {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>(); //map of <sum,freq>
        map.put(0,1); //for empty sub array
        int sum =0;
        int ans = 0;
        for (int i : arr) {
            sum += i;

            if (map.containsKey(sum - k))
            {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
