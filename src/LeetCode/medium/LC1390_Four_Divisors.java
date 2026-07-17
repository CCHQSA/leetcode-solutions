package LeetCode.medium;

public class LC1390_Four_Divisors {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        int resSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            res = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    res++;
                    sum += j;
                    if (res == 4 && j == nums[i]) {
                        resSum += sum;
                        res = 0;
                    }
                }
            }
        }

        return resSum;
    }

}
