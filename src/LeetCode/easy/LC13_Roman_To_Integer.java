package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class LC13_Roman_To_Integer {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);


        int num = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = romanToInt.get(s.charAt(i));
            if (curr < prev) {
                num = num -curr;
            } else {
                num = num + curr;
            }
            prev = curr;
        }
        return num;
    }
}
