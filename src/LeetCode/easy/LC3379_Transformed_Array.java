package LeetCode.easy;

import java.util.Arrays;

public class LC3379_Transformed_Array {
    public int[] constructTransformedArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            if (nums[i] > 0) {
                index = i + nums[i];
                if (index >= nums.length) {
                    index = index % nums.length;
                }
                res[i] = nums[index];
            }else if (nums[i] < 0) {
                index = i + nums[i];
                if (Math.abs(index) > nums.length) {
                    index = index % nums.length;
                    res[i] = nums[Math.abs(index)];
                } else if (Math.abs(index) == nums.length) {
                    res[i] = nums[Math.abs(nums.length + index)];
                }
                if (index < 0) {
                    res[i] = nums[nums.length + index];
                } else {
                    res[i] = nums[index];
                }
            }else if (nums[0] == 0) {
                res[i] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LC3379_Transformed_Array l = new LC3379_Transformed_Array();
        int[] arr = new int[]{0,-3};
        System.out.println(Arrays.toString(l.constructTransformedArray(arr)));
    }
}
