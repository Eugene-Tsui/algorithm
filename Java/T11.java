package Java;

import java.util.Arrays;

public class T11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int start = 0, finish = height.length-1;
        int result = 0;
        while(start < finish){
            int low = Math.min(height[start], height[finish]);
            result = Math.max(result, low*(finish-start));
            if(height[start] <= height[finish]){
                ++start;
            }else{
                --finish;
            }
        }

        return result;
    }
}
