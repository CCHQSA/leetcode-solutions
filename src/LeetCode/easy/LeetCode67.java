package LeetCode.easy;

import java.math.BigInteger;

public class LeetCode67 {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        return x.add(y).toString(2);
    }

    public static void main(String[] args) {
        LeetCode67 leetCode67 = new LeetCode67();
        System.out.println(leetCode67.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
                , "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
