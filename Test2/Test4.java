package Test2;
/*HDU - 2181
 * ���ܶ�������������
*输出结果相同，但输出的格式好像有问题，不知道如何调整*/
import java.util.*;
public class Test4 {
	public static int max=25;
	public static boolean city[][]=new boolean[max][max];
	public static boolean vis[]=new boolean[max];
	public static int path[] = new int[max];
	public static int m,no;
	
	public static void main(String[] args) {
		int i1,i2,i3;
		Scanner cin=new Scanner(System.in);
		for(int i = 1; i <= 20; i++){
	        i1=cin.nextInt();
	        i2=cin.nextInt();
	        i3=cin.nextInt();
	        city[i][i1] = true;
	        city[i][i2] = true;
	        city[i][i3] = true;
	    }
	    while((m=cin.nextInt())!=0){
	        no = 1;
	        vis[m] = true;
	        Dfs(m, 1); 
	    }
	    cin.close();
	}
	public static void Dfs(int from,int cont) {
		 path[cont] = from;
		    if(cont == 20){ 
		        if(city[from][m]){
		        	System.out.print(no++ + ": ");
		            for(int i = 1; i <= 20; i++)
		            	System.out.print(path[i]+" ");
		            System.out.println(m);
		        }
		            return;
		        }
		        for(int i = 1; i <= 20; i++)
		            if(city[from][i] && !vis[i]){
		                vis[i] = true;
		                Dfs(i, cont+1);
		                vis[i] = false; 
		            }
	}

}