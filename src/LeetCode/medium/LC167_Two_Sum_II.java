package LeetCode.medium;

import java.util.Arrays;

public class LC167_Two_Sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new  int[2];
        int sum = 0;
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            sum = numbers[left]+numbers[right];
            if (sum == target){
                res[0] = left+1;
                res[1] = right+1;
                break;
            }else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LC167_Two_Sum_II l = new  LC167_Two_Sum_II();

        System.out.println(Arrays.toString(l.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
