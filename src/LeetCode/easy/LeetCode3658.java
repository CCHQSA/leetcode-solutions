package LeetCode.easy;

public class LeetCode3658 {
    public int gcdOfOddEvenSums(int n) {
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 1; i <= n*2; i++) {
            if (i % 2 != 0) {
                oddNumber += i;
            }else {
                evenNumber += i;
            }
        }
        int count = 2;
        int res = 0;
        boolean divisorOne = false;
        boolean otherDivisor = false;
        for (int i = 1; i < count; i++) {
            count++;
            if (i > oddNumber && i > evenNumber){
                break;
            }
            if (oddNumber%i == 0 &&  evenNumber%i == 0) {
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        LeetCode3658 leetCode3658 = new LeetCode3658();
        System.out.println(leetCode3658.gcdOfOddEvenSums(10));

    }
}
