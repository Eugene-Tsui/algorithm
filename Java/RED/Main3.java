package Java.RED;

import java.util.*;

public class Main3 {
    static int MOD = 1000000007;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];

        int count = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum+=nums[i];
            sum%=MOD;
            if(nums[i]%2 == 0){
                count++;
            }
        }
        int[] dp = new int[10000];
        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
        }
        dp[0] = 1;

        for (int i = 1; i <=n; i++) {
            dp[i] = (n*power(n-i, MOD-2)%MOD + i*power(n-i, MOD-2)% MOD * dp[i-1]%MOD)%MOD;
        }

        long ans = 0;
        for (int i = count; i < n; i++) {
            ans = (ans+dp[i])%MOD;
        }
        ans = (ans+sum)%MOD;

        System.out.println(ans);


    }
    public static int power(int a, int b){
        int res=1;
        while(b>0){
            if((b&1)==1){
                res = res*a%MOD;
            }
            b/=2;
            a = a * a % MOD;

        }
        return res;
    }
}
