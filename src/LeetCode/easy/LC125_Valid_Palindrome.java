package LeetCode.easy;

public class LC125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        String replaced = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (replaced.isEmpty()){
            return true;
        }
        for (int i = 0; i <= replaced.length()/2 ; i++) {
            if (replaced.charAt(i) == replaced.charAt(replaced.length() - 1 - i)){
                isPalindrome = true;
            }else {
                return false;
            }
        }
        return isPalindrome;
    }


}
