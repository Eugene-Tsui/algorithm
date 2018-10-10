package Test2;
/*POJ 3278
 * Catch That k*/
import java.util.*;
public class Test3 {
	public static int maxn =100001;
	public static boolean[] vis = new boolean[maxn];
	public static int[] step = new int[maxn];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		if(n>k)
			System.out.println(n-k);
		else	
			System.out.println(bfs(n,k));
		cin.close();
	}
	public static int bfs(int start,int end) {
		int now;
		int next;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		step[start] =0;
		vis[start] = true;
		while(!queue.isEmpty()){
			now = queue.poll();
			for(int i=0;i<3;i++) {
				if(i==0) next=now-1;
				else if(i==1) next=now+1;
				else next=now*2;
				if(next<0 || next>=maxn) continue;
				if(!vis[next])
				{   
					queue.offer(next) ;
					step[next]=step[now]+1;
					vis[next]=true;
				}
				
				if(next ==end) return step[next];

			}
			
		}
		
		return 0;
	}
}
