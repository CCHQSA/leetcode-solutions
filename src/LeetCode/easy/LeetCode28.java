package LeetCode.easy;

public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, needle.length()+ i).contains(needle)){
                return i;
            }
        }

        if (haystack.contains(needle)) {
            return 0;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        LeetCode28 leetCode28 = new LeetCode28();
        System.out.println(leetCode28.strStr("hello", "ll"));
    }
}
