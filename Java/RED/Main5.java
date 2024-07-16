package Java.RED;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        long sum = 0;
        long max=0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
            sum+=nums[i];
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i]>=max){
                System.out.println(sum);
            }else{
                long num = max*(n-1)-(sum-nums[i])+1;
                if(max-nums[i]<=num){
                    System.out.println(sum+(max-nums[i])*2-1);
                }
                else{
                    long left = -1;
                    long right = max*n+1;
                    while(left+1<right){
                        long val = left+(right-left)/2;
                        if(flag(val, sum, nums[i], n))
                            right = val;
                        else
                            left = val;
                    }
                    System.out.println(sum+2*right-1);
                }
            }
        }


    }

    private static boolean flag(long val, long sum, long num, int n) {
        return num+val>=(double)(sum-num+val-1)/(n-1);

    }

}
