package LeetCode.medium;

public class LeetCode168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0){
            columnNumber--;
            stringBuilder.append((char) (((columnNumber) % 26) + 'A'));
            columnNumber = (columnNumber) / 26;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        LeetCode168 leetCode168 = new LeetCode168();
        System.out.println(leetCode168.convertToTitle(21));
    }
}
