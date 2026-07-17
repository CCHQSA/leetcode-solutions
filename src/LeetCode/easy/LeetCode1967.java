package LeetCode.easy;

public class LeetCode1967 {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode1967 leetCode1967 = new LeetCode1967();
        System.out.println(leetCode1967.numOfStrings(new String[]{"a","a","a"}, "ab"));
    }
}
