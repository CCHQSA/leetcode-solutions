package LeetCode.medium;

import java.math.BigDecimal;

class LeetCode8 {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        StringBuilder num = new StringBuilder();
        boolean negativeSign = false;
        boolean digits = false;
        int signCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ' && !digits && zeroCount == 0) {
                continue;
            }
            if (currentChar == '-' || currentChar == '+') {
                signCount++;
                if (currentChar == '-') {
                    negativeSign = true;
                }
                if (i > 0 && Character.isDigit(s.charAt(i - 1))) {
                    break;
                }
                continue;
            }
            if (signCount >= 2) {
                break;
            }
            if (currentChar == '0' && !digits) {
                zeroCount++;
                continue;
            }
            if (Character.isDigit(currentChar)) {
                num.append(currentChar);
                digits = true;
            } else {
                break;
            }
        }
        if (num.toString().isEmpty()) {
            return 0;
        }
        BigDecimal res = new BigDecimal(num.toString());

        if (negativeSign){
            if (res.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) > 0){
                return Integer.MIN_VALUE;
            }else {
                return -Integer.parseInt(num.toString());
            }
        }else {
            if (res.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) > 0){
                return Integer.MAX_VALUE;
            }else {
                return Integer.parseInt(num.toString());
            }
        }
    }


    public static void main(String[] args) {
        LeetCode8 l = new LeetCode8();
        System.out.println(l.myAtoi("  +  413"));
    }
}
