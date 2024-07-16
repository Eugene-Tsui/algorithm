package Java.Tencent;

import java.util.*;

public class Main2 {
    static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    static int ans=0;
    static String strTencent = "tencent";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] chars = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            chars[i] = str.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(chars[i][j]=='t')
                    dfs(chars, i, j, 1);
            }
        }

        System.out.println(ans);

    }
    public static void dfs(char[][] chars, int i, int j, int step){
        if(step==7){
            ans++;
            return;
        }


        for(int k = 0; k < dir.length; k++) {
            int a = i+dir[k][0];
            int b = j+dir[k][1];
            if(a>=0 && a<chars.length && b>=0 && b<chars[0].length){
                if(chars[a][b] == strTencent.charAt(step)){
                    dfs(chars, a, b, step+1);
                }
            }
        }
    }
}
