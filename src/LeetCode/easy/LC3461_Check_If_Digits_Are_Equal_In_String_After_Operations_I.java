package LeetCode.easy;

public class LC3461_Check_If_Digits_Are_Equal_In_String_After_Operations_I {
    public static boolean hasSameDigits(String s) {
        return method(s);
    }

    public static boolean method(String s) {
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            int q = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';
            sb.append((q + b) % 10);
        }

        return method(sb.toString());
    }

}
