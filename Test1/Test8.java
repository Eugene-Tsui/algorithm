package Test1;

import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a[]=new int[n];
		int count[]=new int[n];
		for(int i=0;i<n;i++)
			count[i]=0;
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<i;j++)
				if(a[j]==a[i])
					count[i]++;
		for(int i=0;i<n;i++)
			System.out.print(count[i]+1+" ");
		cin.close();
	}
}
