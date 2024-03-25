package Java.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class T169 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        //排序
        Arrays.sort(nums);
        System.out.println(nums[nums.length / 2]);
    }
}
