package LeetCode.easy;

public class LC2011_Final_Value_Of_Variable_After_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String oper : operations) {
            if (oper.contains("+")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}
