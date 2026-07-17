package LeetCode.easy;

public class LeetCode231 {
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

    public static void main(String[] args) {
        LeetCode231 leetCode231 = new LeetCode231();
        System.out.println(leetCode231.isPowerOfTwo(1));
    }
}
