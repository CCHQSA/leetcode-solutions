package LeetCode.easy;

public class LeetCode1009 {
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

    public static void main(String[] args) {
        LeetCode1009 l = new LeetCode1009();
        System.out.println(l.bitwiseComplement(7));
    }
}
