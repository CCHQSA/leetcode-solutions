package LeetCode.medium;

public class LeetCode12 {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();


        int thousands = num - num % 1000;
        int hundreds = num - num % 100 - thousands;
        int dozens = num - num % 10 - thousands - hundreds;
        int units = num - thousands - hundreds - dozens;

        if (thousands != 0) {
            res.append("M".repeat(Math.max(0, thousands / 1000)));
        }
        if (hundreds < 400) {
            res.append("C".repeat(Math.max(0, hundreds / 100)));
        } else if (hundreds == 400) {
            res.append("CD");
        } else if (hundreds >= 500 && hundreds < 900) {
            res.append("D");
            res.append("C".repeat((hundreds - 500) / 100));
        } else if (hundreds == 900) {
            res.append("CM");
        }
        if (dozens < 40) {
            res.append("X".repeat(Math.max(0, dozens / 10)));
        } else if (dozens == 40) {
            res.append("XL");
        } else if (dozens >= 50 && dozens < 90) {
            res.append("L");
            res.append("X".repeat((dozens - 50) / 10));
        } else if (dozens == 90) {
            res.append("XC");
        }
        if (units < 4) {
            res.append("I".repeat(Math.max(0, units)));
        } else if (units == 4) {
            res.append("IV");
        } else if (units >= 5 && units < 9) {
            res.append("V");
            res.append("I".repeat((units - 5)));
        } else if (units == 9) {
            res.append("IX");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LeetCode12 leetCode12 = new LeetCode12();
        System.out.println(leetCode12.intToRoman(3749));
    }
}
