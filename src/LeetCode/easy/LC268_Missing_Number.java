package LeetCode.easy;

public class LC268_Missing_Number {
    public int missingNumber(int[] nums) {

        int sum = ((nums.length + 1) *  (nums.length + 2)) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return sum - actualSum;
    }
}
