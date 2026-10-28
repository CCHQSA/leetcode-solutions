package LeetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LC57_Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalsList = new ArrayList<>();

        boolean inserted = false;
        for (int[] row : intervals) {
            if (!inserted && newInterval[0] < row[0]) {
                intervalsList.add(newInterval);
                inserted = true;
            }
            intervalsList.add(row);
        }

        if (!inserted) {
            intervalsList.add(newInterval);
        }

        List<int[]> mergedList = new ArrayList<>();

        int num1 = intervalsList.getFirst()[0];
        int num2 = intervalsList.getFirst()[1];

        for (int i = 1; i < intervalsList.size(); i++) {
            int[] row = intervalsList.get(i);
            if (num2 >= row[0]) {
                num2 = Math.max(num2, row[1]);
            } else {
                mergedList.add(new int[]{num1, num2});
                num1 = row[0];
                num2 = row[1];
            }
        }

        mergedList.add(new int[]{num1, num2});

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
