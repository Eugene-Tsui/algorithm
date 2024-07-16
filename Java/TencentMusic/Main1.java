package Java.TencentMusic;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        String str = "101110110";
        int k = 1;
        int minMax = minMaxV(str, k);
        System.out.println(minMax);
    }
    public static int minMaxV(String str, int k){
        int n =str.length();
        int[][] dp = new int[n+1][k+1];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= k; j++) {
                if(str.charAt(i-1)=='1'){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]+1);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][k];
    }
}
