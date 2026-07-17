package LeetCode.medium;

public class LeetCode3512 {
    public int minOperations(int[] nums, int k) {
        int res = 0;
        int greatest = 0;
        int summ = nums[0];
        for (int i = 1; i < nums.length; i++) {
            summ += nums[i];
            int curr = nums[i - 1];
            if (curr > nums[i] && curr > greatest){
                greatest = curr;
            }
        }
        if (summ % k == 0){
            return 0;
        }
        if (nums.length == 1){
            greatest = nums[0];
        }
        int count = 0;
        while (greatest != 0){
            if (summ % k == 0){
                return count;
            }
            count++;
            summ--;
            greatest--;
        }

        if (greatest == 0 && summ != 0){
            res += count;
            res += summ;
            return res;
        }


        res = count;
        return res;
    }

    public static void main(String[] args) {
        LeetCode3512 leetCode3512 = new LeetCode3512();
        System.out.println(leetCode3512.minOperations(new int[]{2},10));
    }
}
