package LeetCode.easy;

public class LC231_Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        if (n % 2 != 0 && n != 1){
            return false;
        }
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Math.pow(2, i) > n){
                return false;
            }
            if (Math.pow(2, i) == n){
                return true;
            }
        }
        return false;
    }

}
