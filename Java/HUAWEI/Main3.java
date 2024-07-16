package Java.HUAWEI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 给定一个字符串 s ，找出其中不含有重复字符的最长子串的长度。
 * */

public class Main3 {
    public static void main(String[] args) {
        String str = "abbcd";
        Set<Character> set = new HashSet<>();
        int length = str.length();
        int left = 0;
        int max = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, i-left+1);
        }
        System.out.println(max);

    }

}
