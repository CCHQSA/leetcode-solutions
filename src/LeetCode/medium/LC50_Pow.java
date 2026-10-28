package LeetCode.medium;

public class LC50_Pow {
    public double myPow(double x, int n) {
        if (x == 1) { return 1; }
        if (n == 0) { return 1; }

        long N = n;
        if (N < 0) {
            N = -N;
        }

        double res = 1.0;
        while (N > 0) {
            if (N % 2 != 0) {
                res *= x;
            }
            x *= x;
            N /= 2;
        }

        return n < 0 ? 1.0 / res : res;
    }
}
