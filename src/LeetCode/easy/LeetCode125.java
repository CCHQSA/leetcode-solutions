package LeetCode.easy;

public class LeetCode125 {
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

    public static void main(String[] args) {
        LeetCode125 leetCode125 = new LeetCode125();
        System.out.println(leetCode125.isPalindrome("0P"));
    }
}
