package Java.MeiTuan;

import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();


        int i=s.length()-1,j=t.length()-1;

        while(i>=0 && s.charAt(i)==t.charAt(j)){
            i--;
            j--;
        }
        if(i==-1){
            System.out.println(0);
        }else{
            if(isFind(s, i)){
                System.out.println(1);
                System.out.printf("%d %d %c\n", 2,i+1,s.charAt(i));
            }
            else if(isFind(t, j)){
                System.out.println(1);
                System.out.printf("%d %d %c\n", 1,j+1,t.charAt(j));
            }else{
                System.out.println(2);
                System.out.printf("%d %d %c\n", 1,s.length(),'a');
                System.out.printf("%d %d %c", 2,s.length(),'a');
            }
        }


    }

    public static boolean isFind(String s, int i){
        Character temp = null;
        while(i>=0){
            if(temp == null)
                temp = s.charAt(i);
            else{
                if(temp!=s.charAt(i)){
                    return false;
                }
            }
            i--;
        }
        return true;
    }
}

