package Java.youKu;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=sc.nextInt();
            }
            if(sum>=m){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            t--;
        }
    }
}
