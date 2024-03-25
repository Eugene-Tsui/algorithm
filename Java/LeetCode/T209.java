package Java.LeetCode;

public class T209 {
    public static void main(String[] args) {
        int target = 15;
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {

        int res = Integer.MAX_VALUE;
        int sum = 0;
        if(nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = 0;

        while(end != nums.length){
            if(sum<target){
                sum += nums[end];
                end++;
            }else{
                if(res>end - start){
                    res = end - start;
                }
                sum-=nums[start];
                start++;
            }
        }
        while(sum>=target){
            if(res>end - start){
                res = end - start;
            }
            sum-=nums[start];
            start++;
        }
        if(res == Integer.MAX_VALUE)    return 0;
        return res;
    }
}
