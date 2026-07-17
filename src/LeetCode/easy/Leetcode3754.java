package LeetCode.easy;

public class Leetcode3754 {
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

    public static void main(String[] args) {
        Leetcode3754 leetcode3754 = new Leetcode3754();
        System.out.println(leetcode3754.sumAndMultiply(0));
    }
}
