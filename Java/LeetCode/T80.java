package Java.LeetCode;

public class T80 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        System.out.println("1111"+removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int res = 0;
        int num=1;
        for(int i=1;i<nums.length;i++){
            if(num<2){
                if(nums[i] == nums[i-1]){
                    num++;
                }
            }else{
                for(int j=i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                num = 0;
            }
        }
        for(int i=1;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
        return res;
    }
}
