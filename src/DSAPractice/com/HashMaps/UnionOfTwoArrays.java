package DSAPractice.com.HashMaps;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int j : arr2) {
            set.add(j);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        int result = union(arr1, arr2);
        System.out.println("Size of the union set: " + result);

        HashSet<Integer> resultSet = new HashSet<>();
        for (int element : arr1) {
            resultSet.add(element);
        }
        for (int element : arr2) {
            resultSet.add(element);
        }

        System.out.println("Elements in the union set:");
        for (int element : resultSet) {
            System.out.print(element +" ");
        }
    }
}
