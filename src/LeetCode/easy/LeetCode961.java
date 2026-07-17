package LeetCode.easy;

public class LeetCode961 {
    public int repeatedNTimes(int[] nums) {
        int expected = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                    if (count == expected){
                        return nums[i];
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode961 l = new LeetCode961();
        System.out.println(l.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}
