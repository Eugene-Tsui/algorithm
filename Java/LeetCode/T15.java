package Java.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class T15 {
    public static void main(String[] args) {
        int[] num = {0,0,0};
        System.out.println(threeSum(num));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int numLength = nums.length;
        if(numLength<3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < numLength; i++) {
            //如果i位置的数大于等于0，后边所有数相加都大于等于0
            if(nums[i] > 0) break;
            //如果前一个数和当前数相等，则三数相同
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l = i + 1;
            int r = numLength - 1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    //在将左指针和右指针移动的时候，先对左右指针的值，进行判断
                    //如果重复，直接跳过。
                    //去重，因为 i 不变，当此时 l取的数的值与前一个数相同，所以不用在计算，直接跳
                    while(l < r && nums[l] == nums[l+1]) {
                        l++;
                    }
                    //去重，因为 i不变，当此时 r 取的数的值与前一个相同，所以不用在计算
                    while(l< r && nums[r] == nums[r-1]){
                        r--;
                    }
                    //将 左指针右移，将右指针左移。
                    l++;
                    r--;
                } else if(sum<0){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return result;
    }
}
