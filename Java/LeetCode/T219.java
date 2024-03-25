package Java.LeetCode;

import java.util.HashMap;

public class T219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!res.containsKey(nums[i])){
                res.put(nums[i],i);
            }else{
                if(i-res.get(nums[i])<=k){
                    return true;
                }else{
                    res.replace(nums[i],i);
                }
            }
        }


        return false;
    }
}
