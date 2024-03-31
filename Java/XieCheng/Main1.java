package Java.XieCheng;

import java.util.Arrays;
import java.util.Scanner;

//游游拿到了一个数组，她可以进行最多一次操作：选择一个元素全是偶数的区间，使这个区间所有元素除以2。
//游游希望最终所有元素之和尽可能大，你能帮帮她吗？
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        long ans = 0L;
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum+=num[i];
            if(num[i]%2 == 0){
                ans = Math.min(num[i], num[i]+ans);
            }else{
                ans = 0L;
            }
            min = Math.min(ans, min);
        }

        System.out.println(sum-min/2);
    }
}
