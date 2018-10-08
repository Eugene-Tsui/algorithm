package Test1;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int result = 0; 
        int s = 0; 
        int score = 0; 
        while( (score = cin.nextInt()) != 0 ) {
            if(score == 1){
                result += 1;
                s = 0;
            } else {
                s += 2;
                result += s;
            }
        }
        System.out.print(result);
        cin.close();
    }
}
