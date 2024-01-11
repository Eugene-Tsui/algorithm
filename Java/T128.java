package Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class T128 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        int ans = 0;

        if(nums.length == 0){
            return ans;
        }

        Arrays.sort(nums);
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]+1){
                temp++;
            }else{
                ans = Math.max(temp,ans);
                temp = 1;
            }
        }

        return Math.max(temp,ans);
    }

}
