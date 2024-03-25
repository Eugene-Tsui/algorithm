package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class T242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int num = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),num+1);
        }

        for (int i = 0; i < t.length(); i++) {
            int num = map.getOrDefault(t.charAt(i),-1);
            if(num<=0){
                return false;
            }
            map.put(t.charAt(i),num-1);
        }
        return true;
    }
}
