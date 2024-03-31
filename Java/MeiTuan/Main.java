package Java.MeiTuan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int res = 0;
    static Character A;
    static Character B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] charNum;

        String str = sc.nextLine();
        charNum = str.toCharArray();
        backTracing(charNum, 0, 0, 0);
        Random random = new Random();
        System.out.println(random.nextInt(1000000007));
    }
    public static void backTracing(char[] charNum, int n,int numA, int numB){
        if(numA==numB){
            res++;
        }

        for (int i = n; i < charNum.length; i++) {
            if(A == null){
                A = charNum[i];
            }else{
                if(charNum[i]!=A && B==null){
                    B = charNum[i];
                }
            }

            if(charNum[i]!=A && charNum[i]!=B){
                A=null;
                B=null;
                return;
            }else if(charNum[i]==A){
                backTracing(charNum, n+1, numA+1, numB);
            }else if(charNum[i]==B){
                backTracing(charNum, n+1, numA, numB+1);
            }

        }
    }
}
