package LeetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LC1365_How_Many_Numbers_Are_Smaller_Than {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new  int[nums.length];

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sortedNums.length; i++) {
            if (!map.containsKey(sortedNums[i])) {
                map.put(sortedNums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }

        return res;
    }

    public static  void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        LC1365_How_Many_Numbers_Are_Smaller_Than l = new  LC1365_How_Many_Numbers_Are_Smaller_Than();
        System.out.println(Arrays.toString(l.smallerNumbersThanCurrent(nums)));

    }
}
