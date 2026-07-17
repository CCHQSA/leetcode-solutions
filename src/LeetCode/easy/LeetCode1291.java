package LeetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        if (low == high && Integer.parseInt(String.valueOf(String.valueOf(low).charAt(1))) - Integer.parseInt(String.valueOf(String.valueOf(low).charAt(0))) == 1){
            res.add(low);
            return res;
        }

        if (String.valueOf(low).length() == 2){
            if (Integer.parseInt(String.valueOf(String.valueOf(low).charAt(1))) - Integer.parseInt(String.valueOf(String.valueOf(low).charAt(0))) == 1){
                res.add(low);
            }
        }
        int num = low;
        int count = 1;
        int cycle = 0;
        while (num < high) {
            if (count >= 10) {
                cycle++;
                num = sequentialDigit(num, cycle);
                if (num > high || num ==0) break;
                if (num >= low) {
                    res.add(num);
                } else {
                    continue;
                }
                if (num == 123456789) {
                    break;
                }
                continue;
            }
            if (num < 10 * count && num != 9) {
                num++;
                res.add(num);
            } else {
                num += 3;
                count *= 10;
            }
        }
        return res;
    }

    public int sequentialDigit(int num, int cycle) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        if (sb.charAt(sb.length() - 1) == '9' || (sb.charAt(0) == '8' && sb.length() >= 2) || checkNum(sb)) {
            sb = createNum(String.valueOf(sb));
            if (sb.isEmpty()){
                return 0;
            }
            return Integer.parseInt(sb.toString());
        }
        for (int i = 0; i < sb.length(); i++) {
            if (cycle == 1) {
                if (i == 0) {
                    continue;
                } else {
                    int elem = sb.charAt(i - 1) - '0';
                    if (elem == 9 && i + 1 == sb.length()) {
                        return Integer.parseInt(createNum(sb.toString()).toString());
                    }
                    sb.replace(i, i + 1, String.valueOf(elem + 1));
                }
            } else {
                if (i == 0) {
                    int elem = sb.charAt(i) - '0';
                    sb.replace(i, i + 1, String.valueOf(elem + 1));
                } else {
                    int elem = sb.charAt(i - 1) - '0';
                    sb.replace(i, i + 1, String.valueOf(elem + 1));
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public StringBuilder createNum(String num) {
        StringBuilder sb = new StringBuilder();
        if (num.charAt(0) == '1') {
            for (int i = 2; i <= num.length() + 1; i++) {
                sb.append(i);
            }
        } else {
            for (int i = 1; i <= num.length() + 1; i++) {
                sb.append(i);
            }
        }
        if (sb.toString().endsWith("10")){
            return new StringBuilder("0");
        }
        return sb;
    }

    public boolean checkNum(StringBuilder sb) {
        boolean check = false;
        for (int i = 1; i < sb.length(); i++) {
            if (Integer.parseInt(String.valueOf(sb.charAt(i - 1))) - Integer.parseInt(String.valueOf(sb.charAt(i))) == 1) {
                check = true;
            } else {
                return false;
            }
        }
        return check;
    }


    public static void main(String[] args) {
        LeetCode1291 leetCode1291 = new LeetCode1291();
        System.out.println(leetCode1291.sequentialDigits(67, 234));
    }
}
