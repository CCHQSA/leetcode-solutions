package LeetCode.easy;

public class LeetCode58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        LeetCode58 leetCode58 = new LeetCode58();
        System.out.println(leetCode58.lengthOfLastWord("Hello World"));
    }
}
