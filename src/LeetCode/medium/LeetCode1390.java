package LeetCode.medium;

public class LeetCode1390 {
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
    public static void main(String[] args) {
        LeetCode1390 a = new LeetCode1390();
        System.out.println(a.sumFourDivisors(new int[]{1,2,4,8,16}));
    }
}
