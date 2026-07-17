package LeetCode.easy;

public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        boolean isTen = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i] + 1;
            if (digit == 10) {
                isTen = true;
                digits[i] = 0;
                continue;
            } else {
                digits[i] += 1;
                isTen = false;
                break;
            }

        }

        if (isTen) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                ints[i] = digits[i];
            }
            return ints;
        }
        return digits;
    }
}




