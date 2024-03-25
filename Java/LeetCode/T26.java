package Java.LeetCode;

public class T26 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        int left = 0;

        for(int right = 0; right < nums.length;right ++){
            if(nums[right] != nums[left]){
                left++;
                nums[left] = nums[right];
            }
        }
        for(int i = 0; i < left + 1; i++){
            System.out.println(nums[i]);
        }
    }

}
