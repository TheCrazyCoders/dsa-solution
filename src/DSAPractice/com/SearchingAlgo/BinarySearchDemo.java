package DSAPractice.com.SearchingAlgo;

public class BinarySearchDemo {

    public static void main(String[] args){
        int nums[] = {3, 6, 7, 8, 11, 15,18,20};
        int target = 20;

        int result = BinarySearch(nums, target);
        if(result != -1){
            System.out.println("Element found at index : " +result);
        }else{
            System.out.println("Element not found");
        }

    }

    private static int BinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        int steps = 0;
        while (left <= right) {

            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary search:" + steps);
                return mid;

            } else if (nums[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }
        System.out.println("Step taken by Binary Search : " + steps);
        return -1;
    }
}
