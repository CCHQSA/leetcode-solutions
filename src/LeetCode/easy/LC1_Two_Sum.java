package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class LC1_Two_Sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                int curr = nums[i];
                int num = target - curr;
                if(map.containsKey(num)){
                    return new int[] {map.get(num), i};
                }
                map.put(curr, i);
            }
            return null;
        }
    }
}
