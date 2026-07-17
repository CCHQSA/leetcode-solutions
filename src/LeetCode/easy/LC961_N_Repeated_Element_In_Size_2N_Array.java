package LeetCode.easy;

public class LC961_N_Repeated_Element_In_Size_2N_Array {
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

}
