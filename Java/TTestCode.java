package Java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TTestCode {

    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));


    }
    public static int lengthOfLongestSubstring(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        int max = 0;
        char[] chars = s.toCharArray();
        System.out.println(chars.length);
        for (int i = 0; i < chars.length; i++) {
            if(deque.contains(chars[i])){
                max = Math.max(max, deque.size());
                deque.poll();
                i--;
            }else{
                deque.addLast(chars[i]);
            }
        }
        return Math.max(max, deque.size());
    }

}

