package LeetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC459_Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        boolean res = false;
        if (s.length() == 1) {
            return false;
        } else if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return true;
            } else {
                return false;
            }
        }

        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0 && isRepeated(s, i)) {
                return true;
            }
        }

        return res;
    }

    private boolean isRepeated(String s, int i) {
        List<String> subStrings = new ArrayList<>();

        for (int j = 0; j < s.length(); j += i) {
            subStrings.add(s.substring(j, j + i));
        }

        String first = subStrings.get(0);
        return subStrings.stream().allMatch(str -> str.equals(first));
    }


}
