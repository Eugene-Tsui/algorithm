package Simulation;

import java.util.*;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List list = new ArrayList();
		int a=-1;
		for(int i=1;i<=n;i++) {
			if(a==i/2+i/3+i/5)
				continue;
			else {
				list.add(i/2+i/3+i/5);
				a=i/2+i/3+i/5;
				System.out.println(i/2+i/3+i/5);
			}
		}
		//removeDuplicate(list);
		System.out.print(list.size());
	}
	public   static  List removeDuplicate(List list)  {       
		  for  ( int  i  =   0 ; i  <  list.size()  -   1 ; i ++ )  {       
		      for  ( int  j  =  list.size()  -   1 ; j  >  i; j -- )  {       
		           if  (list.get(j).equals(list.get(i)))  {       
		              list.remove(j);       
		            }        
		        }        
		      }        
		    return list;       
		}
}
