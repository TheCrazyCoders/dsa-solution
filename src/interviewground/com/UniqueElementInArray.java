package interviewground.com;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class UniqueElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,1,4,5,5,4};
       printUniqueElement(arr);
       printUniqueElementInJava8(arr);
    }
    private static void printUniqueElement(int[] nums){
        HashSet<Integer> numsSet = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            numsSet.add(nums[i]);
        }
        System.out.println(numsSet);
    }

    private static void printUniqueElementInJava8(int[] nums){
       Arrays.stream(nums)
               .distinct()
               .forEach(System.out::println);
    }

}
