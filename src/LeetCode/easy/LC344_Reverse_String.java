package LeetCode.easy;

public class LC344_Reverse_String {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char last = s[s.length - i - 1];
            s[s.length - i - 1] = s[i];
            s[i] = last;
        }
    }
}
