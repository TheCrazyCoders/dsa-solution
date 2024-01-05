package DSAPractice.com.HashMaps;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int dupArr : arr){
            if(set.contains(dupArr))
                return true;
            set.add(dupArr);

        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,7,7};
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }
}
