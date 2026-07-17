package LeetCode.easy;

public class LeetCode69 {
    public int mySqrt(int x) {
        double low = 0;
        double high = x;
        while (low <= high) {
            double middle = (double) (low + high) / 2;
            if (Math.floor(middle * middle) == x) {
                return (int) Math.floor(middle);
            }
            if (middle * middle > x) {
                high = middle;
            }else {
                low = middle;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        LeetCode69 leetCode69 = new LeetCode69();
        System.out.println(leetCode69.mySqrt(4));
    }
}
