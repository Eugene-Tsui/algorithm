package Java.LeetCode;

import java.util.Objects;

public class T125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
    public static boolean isPalindrome(String s){
        if(s.isEmpty() || s.length() ==1) return true;
        String str = s;
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        T125 t125 = new T125();
        return t125.isPa(str);
    }
    public boolean isPa(String s){
        for (int i = 0,j=s.length()-1; i <= s.length()/2; i++,j--) {
            System.out.println(i+" "+ j);
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
