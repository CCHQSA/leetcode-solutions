package LeetCode.easy;

public class LC3754_Concatenate_Non_Zero_Digits_And_Multiply_By_Sum_I {
    public long sumAndMultiply(int n) {
        long res = 0;
        long multiplier = 0;
        String numStr = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '0') {
                sb.append(numStr.charAt(i));
                multiplier += Integer.parseInt(String.valueOf(sb.toString().charAt(count++)));
            }
        }
        if (sb.length() == 0) {
            return 0;
        }
        return Integer.parseInt(sb.toString()) * multiplier ;
    }

}
