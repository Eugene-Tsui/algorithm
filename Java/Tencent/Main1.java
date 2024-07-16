package Java.Tencent;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int[][] dp = new int[n+1][k+1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                int xor = 0;
                for (int l = i; l >=1 ; l--) {
                    xor ^= num[l-1];
                    dp[i][j] = Math.max(dp[i][j], dp[l-1][j-1]+xor);
                }
            }
        }

        System.out.println(dp[n][k]);

    }
}
