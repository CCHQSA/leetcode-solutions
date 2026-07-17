package LeetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
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

    public static void main(String[] args) {
        LeetCode217 l = new LeetCode217();
        System.out.println(l.containsDuplicate(new int[]{1, 5, -2, -4, 0}));
    }
}
