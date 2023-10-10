package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MMMXLV"));
    }
    public static int romanToInt(String s){
        int sum = 0;
        int n = s.length();
        HashMap<String, Integer> num1 = new HashMap<>();
        num1.put("I", 1);
        num1.put("V", 5);
        num1.put("X", 10);
        num1.put("L", 50);
        num1.put("C", 100);
        num1.put("D", 500);
        num1.put("M", 1000);
        
        for (int i = 0; i < n; i++) {
            String a = String.valueOf(s.charAt(i));
            sum += num1.get(a);
            if(i>0){
                String b = String.valueOf(s.charAt(i-1));
                if(a.equals("V") && b.equals("I")){
                    sum -= 2;
                }
                if(a.equals("X") && b.equals("I")){
                    sum-=2;
                }
                if(a.equals("L") && b.equals("X")){
                    sum-=20;
                }
                if(a.equals("C") && b.equals("X")){
                    sum-=20;
                }
                if(a.equals("D") && b.equals("C")){
                    sum-=200;
                }if(a.equals("M") && b.equals("C")){
                    sum-=200;
                }
            }
        }
        return sum;
    }
}
