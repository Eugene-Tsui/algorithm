package Java.youKu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int MOD = 10007;
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='+'){
                list.add((int)chars[i+1]-48);
            }
            if(chars[i]=='-'){
                list.add(-(int)chars[i+1]+48);
            }
        }

        int res=0;
        int val;

        for (int i = 0; i < list.size(); i++) {
            val=1;
            for (int j = 0; j < list.size(); j++) {
                if(i!=j){
                    val*=list.get(j);
                    val%=MOD;
                }
            }
            res+=val;
            res%=MOD;
        }
        System.out.println(res%MOD);
    }
}
