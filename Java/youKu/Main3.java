package Java.youKu;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = numbers(x,y,a,b);
        System.out.println(res);
    }

    private static int numbers(int x, int y, int a, int b) {

        if(b%a !=0 ){
            return -1;
        }
        int val = 0;
        int res = b/a;


        while(res!=1){
            if(res%y==0){
                res/=y;
                val++;
            }else if(res%x == 0){
                res /= x;
                val++;
            }else{
                return -1;
            }
        }


        return val;
    }

}
