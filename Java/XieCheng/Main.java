package Java.XieCheng;

import java.util.*;

// 游游拿到了一个 01 矩阵，
// 她每次操作可以选择一个 1*2（1 行 2 列，不能 2 行 1 列）的区域，
// 将所有字符都变成 1。游游想知道，将所有字符都变成 1 需要最少操作多少次？
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] num = new int[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            for (int j = 0; j < m; j++) {
                num[i][j] = temp.charAt(j)-'0';
            }
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(num[i][j]==0){
                    ans++;
                    num[i][j]=1;
                    if(j<m-1){
                        num[i][j+1] = 1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}