package LeetCode.easy;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        if (arr.contains(target)){
            return arr.indexOf(target);
        }else {
            for (int i = 0; i < arr.size()/2; i++) {
                if (target > arr.get(i) && target < arr.get(i + 1)){
                    return i + 1;
                }
            }
        }
        Collections.sort(arr);
        if (target > arr.getLast()){
            return arr.size();
        }else {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(arr.size() - 1 - i) > target){
                    continue;
                }else {
                    return arr.size() - i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode35 leetCode35 = new LeetCode35();
        System.out.println(leetCode35.searchInsert(new int[]{2,3,5,6,9}, 7));
    }
}
