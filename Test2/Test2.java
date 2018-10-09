package Test2;
/*POJ - 1321*/
import java.util.Scanner;
public class Test2 {
	public static int col[]=new int[100];
	public static int num[][]=new int[100][100];
	public static int n,k;
	public static String a;
	public static int ans=0;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			n=cin.nextInt();
			k=cin.nextInt();
			if(n==-1&&k==-1) break;
			for(int i=0;i<n;i++) {
				a=cin.next();
				for(int j=0;j<n;j++) {
					 num[i][j] = (a.charAt(j) == '#')?0:1;
				}
			}
			ans = 0;
			dfs(0,0);
			System.out.printf("%d\n",ans);
	        cin.nextLine();
		}
		cin.close();
	}
	public static void dfs(int x,int y) {
		if(y==k) {
			ans++;
			return;
		}
		if(x>=n) {
			return;
		}
		for(int i=0;i<n;i++) {
			if(num[x][i]==1||col[i]==1)
				continue;
			col[i]=1;
			dfs(x+1,y+1);
			col[i]=0;
		}
		dfs(x+1,y);
	}
}