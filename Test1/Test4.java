package Test1;
/*HDOJ 1096*/
import java.util.*;
import java.math.*;
import java.io.*;
public class Test4 {

    public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		while(in.hasNext())
		{
		    int n;
		    n=in.nextInt();
		    for(int i=1;i<=n;i++)
		    {
		        int a;
		        a= in.nextInt();
		        int c;
		        c=0;
		        for(int t=0;t<a;t++)
		        {
		            int b;
		            b=in.nextInt();
		            c=c+b;
		        }
		        System.out.println(c);
		        if(i!=n)
		        {
		        System.out.println( );
		        }
		    }
		}
    }
}