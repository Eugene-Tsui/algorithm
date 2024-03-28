package Java;

import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //sum
        int sum=0,m=1;
        while(n>sum){
            sum+=m++;
        }
        if(n-sum!=0){
            System.out.println("no");
            return;
        }else{
            System.out.println("yes");
        }

        m = m-1;
        int[][] a = new int[m][m];
        for(int l=0;l<m;l++){
            Arrays.fill(a[l],0);
        }
        a[0][0]=1;
        int i=0,j=0,c=1;
        while(true){
            while(i+1<m && a[i+1][j]==0)
                a[++i][j] = ++c;
            while(j+1<m && a[i][j+1]==0)
                a[i][++j]=++c;
            while(i-1>0 && j-1>0 && a[i-1][j-1]==0)
                a[--i][--j]=++c;
            if(i+1>=m)break;
            if(a[i+1][j]!=0)
                break;
        }
        for (i = 0; i < m; i++) {
            for(j=0;j<=i;j++){
                if(a[i][j]!=0)
                    System.out.printf("%02d ",a[i][j]);
            }
            System.out.println();
        }

    }
}