package DSAPractice.com.SearchingAlgo;

public class LinearSearchDemo {

    public static void main(String[] args){
        int nums[] = {3, 6, 7, 8, 11, 15,18,20};
        int target = 180;

        int result = LinearSearch(nums, target);
        if(result != -1){
            System.out.println("Element found at Index : " +result);
        }else {
            System.out.println("Element not found");
        }

    }

    private static int LinearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i = 0; i< nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Step taken by Linear Search : " +steps);
                return i;
            }

        }
        System.out.println("Step taken by Linear Search : " +steps);
        return -1;
    }
}
