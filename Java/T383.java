package Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T383 {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote,magazine));

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {

            int num = map.getOrDefault(magazine.charAt(i),0);
            map.put(magazine.charAt(i),num+1);

        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int num = map.getOrDefault(ransomNote.charAt(i),0);
            if(num>0){
                map.replace(ransomNote.charAt(i),num-1);
            }else{
                return false;
            }
        }

        return true;
    }
}
