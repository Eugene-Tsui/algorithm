package Java.XieCheng;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 1;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            int temp = num[i];
            while(temp!=0){
                sum*=temp--;
            }
        }
        System.out.println(yinZi(sum));
    }
    public static int yinZi(int num){
        int i=1, res=0;
        while(num%i==0){
            res++;
            i++;
        }
        return res;
    }
}
