package DSAPractice.com.HashMaps;

import java.util.HashMap;

public class MajorityElement {
    public static void majorityElement(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int j : arr) {

            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > (n / 3)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 1, 3, 1, 5, 1};
        majorityElement(arr);
    }
}
