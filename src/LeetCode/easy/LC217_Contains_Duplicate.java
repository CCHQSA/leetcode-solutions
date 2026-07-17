package LeetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class LC217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
