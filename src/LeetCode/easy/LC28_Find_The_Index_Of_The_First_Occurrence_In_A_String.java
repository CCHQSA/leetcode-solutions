package LeetCode.easy;

public class LC28_Find_The_Index_Of_The_First_Occurrence_In_A_String {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, needle.length()+ i).contains(needle)){
                return i;
            }
        }

        if (haystack.contains(needle)) {
            return 0;
        } else {
            return -1;
        }
    }


}
