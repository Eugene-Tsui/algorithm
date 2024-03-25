package Java.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class T30 {
    public static void main(String[] args) {
        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};
        System.out.println(findSubstring(s,words));
    }
    public static List<Integer> findSubstring(String s, String[] words) {



        List<Integer> res = new ArrayList<>();
        int wordLength = words[0].length();
        if(s.length()<words.length*wordLength){
            return res;
        }
        HashMap<String, Integer> wordsHashMap = new HashMap<>();

        for (int i = 0; i < wordLength && i+wordLength*words.length<=s.length(); i++) {
            //开始窗口的单词放入hashmap
            wordsHashMap.clear();
            for (int j = i; j < i + wordLength*words.length; j+=wordLength) {
                String start = s.substring(j,j+wordLength);

                if(wordsHashMap.containsKey(start)){
                    wordsHashMap.replace(start,wordsHashMap.get(start)+1);
                }else{
                    wordsHashMap.put(start,1);
                }
            }
            //开始窗口的判断
            for (int j = 0; j < words.length; j++) {
                if(wordsHashMap.containsKey(words[j])){
                    if(wordsHashMap.get(words[j])-1 == 0){
                        wordsHashMap.remove(words[j]);
                    }else {
                        wordsHashMap.replace(words[j],wordsHashMap.get(words[j])-1);
                    }

                }else{
                    wordsHashMap.put(words[j],-1);
                }
            }

            //滑动窗口接下来的操作
            for (int j = i; j < s.length() - (wordLength * words.length) + 1; j+=wordLength) {
                if (j != i){
                    String start = s.substring(j-wordLength,j);
                    String end = s.substring(j + (wordLength * (words.length-1)), j + (wordLength * words.length));
                    System.out.println("start: "+start);
                    System.out.println("end: "+end);

                    //窗口前端去除单词
                    if(wordsHashMap.containsKey(start)){
                        if(wordsHashMap.get(start)-1 == 0){
                            wordsHashMap.remove(start);

                        }else {
                            wordsHashMap.replace(start,wordsHashMap.get(start)-1);
                        }

                    }else {
                        wordsHashMap.put(start,-1);
                    }

                    //窗口尾端添加单词
                    if(wordsHashMap.containsKey(end)){
                        if(wordsHashMap.get(end)+1 == 0){
                            wordsHashMap.remove(end);
                            //System.out.println("wordsHashMap: "+wordsHashMap);
                        }else
                        {
                            wordsHashMap.replace(end,wordsHashMap.get(end)+1);
                        }

                    }else{
                        wordsHashMap.put(end,1);
                    }
                    System.out.println("wordsHashMap: "+wordsHashMap);
                }

                if (wordsHashMap.isEmpty()){
                    res.add(j);
                }
            }

        }
        return res;
    }
}

