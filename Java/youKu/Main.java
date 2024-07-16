package Java.youKu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
            int w = sc.nextInt();
            int l = sc.nextInt();
            int h = sc.nextInt();

            int min = Math.min(w, l);
            int max = Math.max(w, l);

            if(min>=2*h && max<=2*min){
                System.out.println("good");
            }else{
                System.out.println("bad");
            }
            t--;
        }
    }
}
