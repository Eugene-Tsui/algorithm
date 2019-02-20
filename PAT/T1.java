package Test1;
import java.util.*;
public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=a*b;
		
		List<String> lists = new ArrayList<String>();
		int i=0;
		while(c>10) {
			
			lists.add(i,String.valueOf(c%10));
			i++;
			c/=10;
		}
		lists.add(i,String.valueOf(c%10));
		Iterator<String> it = lists.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		input.close();
	}

}
