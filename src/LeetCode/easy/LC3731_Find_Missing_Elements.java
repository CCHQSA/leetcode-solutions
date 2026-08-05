package LeetCode.easy;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC3731_Find_Missing_Elements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        List<Integer> numsAsList = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        for (int i = min; i < max; i++) {
            list.add(i);
        }

        list.removeAll(numsAsList);

        return list;

    }

    static void main() {
        LC3731_Find_Missing_Elements sol = new LC3731_Find_Missing_Elements();
        System.out.println(sol.findMissingElements(new int[]{1,4,2,5}));
    }
}
