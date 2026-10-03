package LeetCode.easy;

import java.util.*;

public class LC448_Find_All_Numbers_Disappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                continue;
            }
            nums[index] = -nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}
