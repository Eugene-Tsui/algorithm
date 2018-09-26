package Test1;
/*201403-1 Ïà·´Êı ccf*/
import java.util.*;
public class Test6 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n= cin.nextInt();
		int a[] = new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]=cin.nextInt();
		}
		for(int i = 0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==0)
					count++;
		System.out.println(count);
		cin.close();
	}
}
