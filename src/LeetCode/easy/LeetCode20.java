package LeetCode.easy;

public class LeetCode20 {
    public boolean isValid(String s) {
        boolean changed = true;

        while (changed) {
            changed = false;

            if (s.contains("()")) {
                s = s.replace("()", "");
                changed = true;
            }

            if (s.contains("[]")) {
                s = s.replace("[]", "");
                changed = true;
            }

            if (s.contains("{}")) {
                s = s.replace("{}", "");
                changed = true;
            }
        }

        return s.isEmpty();
    }



    static void main() {
        LeetCode20 leetCode20 = new LeetCode20();
        System.out.println(leetCode20.isValid("([)]"));
    }
}
