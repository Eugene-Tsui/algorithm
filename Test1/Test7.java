package Test1;

import java.util.*;
public class Test7 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n= cin.nextInt();
		int a[] = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			a[i]=cin.nextInt();
		}
		
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]-a[j]==1||a[i]-a[j]==-1)
					count++;
		System.out.println(count);
		cin.close();
	}
}
