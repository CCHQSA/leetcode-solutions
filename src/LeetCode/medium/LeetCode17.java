package LeetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();

        Hashtable<Character, String[]> digitValues = new Hashtable<>();
        digitValues.put('2', new String[]{"a", "b", "c"});
        digitValues.put('3', new String[]{"d", "e", "f"});
        digitValues.put('4', new String[]{"g", "h", "i"});
        digitValues.put('5', new String[]{"j", "k", "l"});
        digitValues.put('6', new String[]{"m", "n", "o"});
        digitValues.put('7', new String[]{"p", "q", "r", "s"});
        digitValues.put('8', new String[]{"t", "u", "v"});
        digitValues.put('9', new String[]{"w", "x", "y", "z"});

        if (digits.length() == 1) {
            return Arrays.asList(digitValues.get(digits.charAt(0)));
        }

        getCombinations(0, new StringBuilder(), digits, digitValues, res);


        return res;
    }


    private void getCombinations(int index, StringBuilder current, String digits,
                           Hashtable<Character, String[]> digitValues, List<String> res) {


        if (index == digits.length()) {
            res.add(current.toString());
            return;
        }

        char currentDigit = digits.charAt(index);
        String[] letters = digitValues.get(currentDigit);

        for (String letter : letters) {
            current.append(letter);
            getCombinations(index + 1, current, digits, digitValues, res);
            current.deleteCharAt(current.length() - 1);
        }
    }


    public static void main(String[] args) {
        LeetCode17 leetcode17 = new LeetCode17();
        System.out.println(leetcode17.letterCombinations("234"));
    }
}


