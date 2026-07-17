package LeetCode.easy;

import java.util.Arrays;

public class LeetCode3010 {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums, 1, nums.length);
        return nums[0] + nums[1] + nums[2];
    }


    public static void main(String[] args) {
        LeetCode3010 l = new LeetCode3010();
        int[] arr = new int[]{1, 3, 4, 5};
        System.out.println(l.minimumCost(arr));
    }

}