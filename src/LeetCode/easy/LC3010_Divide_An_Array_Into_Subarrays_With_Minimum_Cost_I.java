package LeetCode.easy;

import java.util.Arrays;

public class LC3010_Divide_An_Array_Into_Subarrays_With_Minimum_Cost_I {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums, 1, nums.length);
        return nums[0] + nums[1] + nums[2];
    }

}