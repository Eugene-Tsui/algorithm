package Java.LeetCode;

import javax.swing.plaf.basic.BasicMenuUI;
import java.util.HashMap;
import java.util.Map;

public class T205 {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character,Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(!map.containsValue(t.charAt(i)) && map.containsKey(s.charAt(i))){
                return false;
            }
            if(map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))){
                return false;
            }

            if(map.containsKey(s.charAt(i))){

                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            map.put(s.charAt(i),t.charAt(i));
        }

        return true;
    }
}
