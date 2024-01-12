package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T56 {
    public static void main(String[] args) {
        int[][] intervals = {{2,6},{1,3},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));

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
