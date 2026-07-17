package LeetCode.medium;

import java.util.*;

public class LC3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1){
            return s.length();
        }
        Set<Character> set = new HashSet<>();
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!set.add(s.charAt(j))){
                    res = Math.max(res, set.size());
                    set.clear();
                }
            }
            res  = Math.max(res, set.size());
            set.clear();
        }
        return res;
    }



        public static void main (String[]args){
            LC3_Longest_Substring_Without_Repeating_Characters l = new LC3_Longest_Substring_Without_Repeating_Characters();
            String s = "au";
            System.out.println(l.lengthOfLongestSubstring(s));
        }
    }
