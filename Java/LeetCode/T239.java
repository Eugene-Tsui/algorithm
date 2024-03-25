package Java.LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T239 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {

            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekFirst()]<=nums[i]){
                deque.removeLast();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            System.out.println(deque);
            if(!deque.isEmpty() && i>=k-1){
                res[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
