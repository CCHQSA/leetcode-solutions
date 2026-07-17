package LeetCode.easy;

public class LeetCode1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int len = word1.length() + word2.length();
        for (int i = 0; i < len; i++) {
            if (i >= word1.length()) {
                if (i >= word2.length()) {
                    break;
                } else {
                    res.append(word2.charAt(i));
                    continue;
                }
            }
            if (i >= word2.length()) {
                if (i >= word1.length()) {
                    break;
                } else {
                    res.append(word1.charAt(i));
                    continue;
                }
            }
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode1768 leetcode1768 = new LeetCode1768();
        System.out.println(leetcode1768.mergeAlternately("abcd", "pq"));
    }
}
