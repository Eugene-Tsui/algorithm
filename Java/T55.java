package Java;

public class T55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int max=nums[0],i=0;
        for(;i<nums.length;i++){
            if(max<0){
                return false;
            }else{
                max = Math.max(max, nums[i]);
            }
            max--;
        }
        return i == nums.length;
    }
}
