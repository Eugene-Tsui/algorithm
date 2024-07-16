package Java.youKu;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(i%2==0){
                min = Math.min(num, min);
                sum+=num;
            }else{
                max = Math.max(num, max);
                sum -= num;
            }
        }
        sum-=min*2;
        sum+=max*2;
        System.out.println(sum);
    }
}
