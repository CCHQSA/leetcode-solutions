package LeetCode.easy;

public class LeetCode190 {
    public int reverseBits(int n) {
        String reversed = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(reversed);
        sb.reverse();

        while (sb.length() != 32){
            sb.append(0);
        }
        reversed = sb.toString();

        return Integer.parseInt(reversed, 2);
    }

    public static void main(String[] args) {
        LeetCode190 l = new LeetCode190();
        System.out.println(l.reverseBits(43261596));
    }
}
