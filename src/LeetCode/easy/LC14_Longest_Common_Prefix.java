package LeetCode.easy;

public class LC14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        StringBuilder result = new StringBuilder();
        boolean allMatch = false;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].length() > i && strs[0].charAt(i) == strs[j].charAt(i)){
                    allMatch = true;
                } else {
                    allMatch = false;
                    break;
                }
            }
            if(allMatch){
                result.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}

