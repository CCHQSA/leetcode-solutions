package LeetCode.easy;

public class LeetCode2154 {
    public int findFinalValue(int[] nums, int original) {
        boolean containsOriginal = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original){
                containsOriginal = true;
            }
        }
        if (containsOriginal){
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != original){
                    res += nums[i];
                }
            }
            return res;
        }else {
            return original;
        }
    }

    public static void main(String[] args) {
        LeetCode2154 leetCode2154 = new LeetCode2154();
        System.out.println((leetCode2154.findFinalValue(new int[]{5,3,6,1,12}, 3)));
    }
}
