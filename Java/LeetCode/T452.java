package Java.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class T452 {
    public static void main(String[] args) {
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(findMinArrowShots(points));

    }
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        int ans=1;
        int rightMin = points[0][1];

        //从头进行遍历
        for (int[] point : points) {
            if (point[0] > rightMin) {
                rightMin = point[1];
                ans++;
            } else {
                rightMin = Math.min(point[1], rightMin);
            }
        }

        return ans;
    }
}
