package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class T49 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] s_arr = str.toCharArray();
            Arrays.sort(s_arr);

            String str_arr = Arrays.toString(s_arr);

            if (map.containsKey(str_arr)) {
                map.get(str_arr).add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(str_arr, temp);
            }
        }

        return new ArrayList<>(map.values());
    }
}
