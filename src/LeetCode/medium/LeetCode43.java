package LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode43 {
    public String multiply(String num1, String num2) {
        int len1;
        int len2;
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        boolean first = false;
        if (num1.length() >= num2.length()) {
            len1 = num1.length();
            len2 = num2.length();
            first = true;
        } else {
            len1 = num2.length();
            len2 = num1.length();
        }
        if (num1.length() == 1 && num2.length() == 1) {
            return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        }
        List<StringBuilder> result = new ArrayList<>();
        StringBuilder res = new StringBuilder();

        if (first) {
            for (int i = 0; i < len2; i++) {
                int fraction = 0;
                int multiplier = Integer.valueOf(num2.charAt(len2 - i - 1) - '0');
                for (int j = 0; j < len1; j++) {
                    var num = Integer.valueOf(num1.charAt(len1 - j - 1) - '0') * multiplier;
                    if (j == len1 - 1) {
                        if (fraction > 0) {
                            num += fraction;
                            fraction = 0;
                        }
                        res.insert(0, num);
                        result.add(res);
                        res = new StringBuilder();
                    } else {
                        if (fraction > 0) {
                            num += fraction;
                            fraction = 0;
                            if (num >= 10) {
                                fraction = num / 10;
                                num = num - fraction * 10;
                            }
                        }
                        if (num >= 10) {
                            fraction = num / 10;
                            num = num - fraction * 10;
                        }

                        res.insert(0, num);

                    }
                }
            }
        } else {
            for (int i = 0; i < len2; i++) {
                int fraction = 0;
                int multiplier = Integer.valueOf(num1.charAt(len2 - i - 1) - '0');
                for (int j = 0; j < len1; j++) {
                    var num = Integer.valueOf(num2.charAt(len1 - j - 1) - '0') * multiplier;
                    if (j == len1 - 1) {
                        if (fraction > 0) {
                            num += fraction;
                            fraction = 0;
                        }
                        res.insert(0, num);
                        result.add(res);
                        res = new StringBuilder();
                    } else {
                        if (fraction > 0) {
                            num += fraction;
                            fraction = 0;
                            if (num >= 10) {
                                fraction = num / 10;
                                num = num - fraction * 10;
                            }
                        }
                        if (num >= 10) {
                            fraction = num / 10;
                            num = num - fraction * 10;
                        }

                        res.insert(0, num);
                    }
                }
            }
        }


        return add(result);
    }

    public String add(List<StringBuilder> list) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            StringBuilder current = list.get(i);
            for (int j = 0; j < count; j++) {
                current.append(0);
            }
            count++;
            list.set(i, current);
        }
        for (int i = 0; i < list.size(); i++) {
            int len = list.getLast().toString().length();
            while (list.get(i).toString().length() != len) {
                list.get(i).insert(0, 0);
            }
        }
        int fraction = 0;
        int sum = 0;
        boolean nextStep = false;
        count = 1;
        for (int i = 0; i < list.getLast().length(); i++) {
            sum = 0;
            if (nextStep) {
                sum += fraction;
                fraction = 0;
                nextStep = false;
            }
            for (int j = 0; j < list.size(); j++) {
                sum += Integer.valueOf(list.get(j).toString().charAt(list.get(j).length() - count) - '0');
                if (sum >= 10 && j == list.size() - 1) {
                    fraction = sum / 10;
                    sum = sum - fraction * 10;
                    nextStep = true;
                }
            }
            if (fraction != 0 && i == list.getLast().length() - 1) {
                sum = sum + fraction * 10;
                res.insert(0, sum);
            } else {
                res.insert(0, sum);
            }
            count++;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode43 leetCode43 = new LeetCode43();
        System.out.println(leetCode43.multiply("456", "123"));
    }
}
