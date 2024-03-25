package Java.LeetCode;

import java.util.HashSet;

public class T136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int[] nums) {
        int singNum = 0;
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            singNum = singNum ^ nums[i];
        }
        return singNum;

    }
}
