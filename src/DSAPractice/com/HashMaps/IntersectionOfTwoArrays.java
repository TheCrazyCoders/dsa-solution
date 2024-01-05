package DSAPractice.com.HashMaps;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int intersection(int[] arr1, int[] arr2){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr1){
            set.add(i);
        }
        for(int j : arr2){
            if(set.contains(j)){
                count++;
                System.out.println("Intersection elements are :" +j);
                set.remove(j);

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        int result = intersection(arr1, arr2);
        System.out.println("No of intersection elements are: " +result);
    }
}
