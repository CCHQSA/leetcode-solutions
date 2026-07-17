package LeetCode.easy;

public class LC1967_Number_Of_Strings_That_Appear_As_Substrings_in_Word {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                res++;
            }
        }
        return res;
    }


}
