package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int majorityNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int a = map.get(nums[i]) + 1;
                map.put(nums[i], a);
                if (res < a){
                    majorityNum = nums[i];
                    res = a;
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return majorityNum;
    }

    public static void main(String[] args) {
        LeetCode169 l = new LeetCode169();
        System.out.println(l.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
