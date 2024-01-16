package Java;

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
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] point1, int[] point2){
                if (point1[0]>point2[0]){
                    return 1;
                } else if (point1[0]<point2[0]) {
                    return -1;
                } else {
                  return 0;
                }
            }
        });

        int ans=1;
        int rightMin = points[0][1];

        //从头进行遍历
        for (int i = 0; i < points.length; i++) {
            if (points[i][0]>rightMin){
                rightMin = points[i][1];
                ans++;
            }else{
                rightMin = Math.min(points[i][1],rightMin);
            }
        }

        return ans;
    }
}
