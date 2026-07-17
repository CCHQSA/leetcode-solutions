package LeetCode.easy;

public class LC1009_Complement_Of_Base_10_Integer {
    public int bitwiseComplement(int n) {
        String binaryStr = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1') {
                sb.append('0');
            }else {
                sb.append('1');
            }
        }

        return Integer.parseInt(sb.toString(), 2);
    }

}
