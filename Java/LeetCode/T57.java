package Java.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T57 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] res = insert(intervals, newInterval);
        for (int[] i : res) {
            System.out.println(i[0] + " " + i[1]);
        }

    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] internalsMerge = new int[intervals.length+1][2];

        for (int i = 0; i < intervals.length; i++) {
            internalsMerge[i][0] = intervals[i][0];
            internalsMerge[i][1] = intervals[i][1];
        }
        internalsMerge[intervals.length][0] = newInterval[0];
        internalsMerge[intervals.length][1] = newInterval[1];

        return merge(internalsMerge);
    }

    public static int[][] merge(int[][] intervals) {

        if(intervals.length == 0){
            return new int[0][2];
        }

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {

            int low = interval[0], high = interval[1];
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < low) {
                ans.add(new int[]{low, high});
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], high);
            }

        }

        return ans.toArray(new int[ans.size()][]);
    }
}
