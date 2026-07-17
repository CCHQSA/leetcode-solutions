package LeetCode.medium;

public class LC7_Reverse_Integer {
        public int reverse(int x) {
            if (x == 0) {
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            if (x > 0) {
                sb.append(x).reverse();
                while (sb.toString().startsWith("0")) {
                    sb.deleteCharAt(0);
                }
            } else {
                sb.append(x).reverse();
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, "-");
            }
            if (Long.parseLong(sb.toString()) > Integer.MAX_VALUE || Long.parseLong(sb.toString()) < Integer.MIN_VALUE) {
                return 0;
            } else {
                return Integer.parseInt(sb.toString());
            }
        }

}
