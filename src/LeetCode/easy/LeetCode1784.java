package LeetCode.easy;

public class LeetCode1784 {
    public boolean checkOnesSegment(String s) {
        return s.contains("01");
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1784().checkOnesSegment("110"));
    }
}
