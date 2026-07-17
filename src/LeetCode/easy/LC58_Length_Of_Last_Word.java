package LeetCode.easy;

public class LC58_Length_Of_Last_Word {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

}
