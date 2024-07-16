package Java;


import java.util.*;

/**
 * 给定一个字符串 s ，根据字符出现的 频率 对其进行 降序排序 。一个字符出现的 频率 是它出现在字符串中的次数。
 * 返回 已排序的字符串 。如果有多个答案，返回其中任何一个。
 * s = "tree"，输出eert,eetr都可以
 * */

public class Main {
    public static void main(String[] args) {
        String str = "tree";
        char[] nums = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }



        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i).getValue();
            while(number>0){
                System.out.print(list.get(i).getKey());
                number--;
            }
        }



    }
}
