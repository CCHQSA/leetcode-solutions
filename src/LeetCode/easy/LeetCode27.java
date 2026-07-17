package LeetCode.easy;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        LeetCode27 leetCode27 = new LeetCode27();
        System.out.println(leetCode27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
