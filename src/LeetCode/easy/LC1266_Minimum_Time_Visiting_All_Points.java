package LeetCode.easy;

public class LC1266_Minimum_Time_Visiting_All_Points {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int[] point = points[0];

        for (int i = 1; i < points.length; i++) {
            int[] curr = points[i];
            int res = Math.max( Math.abs(point[0] - curr[0]), Math.abs(point[1] - curr[1]));
            point = curr;
            time += res;
        }

        return time;
    }

    public static void main(String[] args) {
        LC1266_Minimum_Time_Visiting_All_Points l = new LC1266_Minimum_Time_Visiting_All_Points();
        System.out.println(l.minTimeToVisitAllPoints(new int[][]{{1,1}, {3,4}, {-1,0}}));
    }
}
