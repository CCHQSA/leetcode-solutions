package LeetCode.easy;

public class LC69_Sqrt {
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
}
