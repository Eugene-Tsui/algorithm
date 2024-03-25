package Java.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class T71 {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        String[] names = path.split("/");

        Deque<String> deque = new ArrayDeque<>();
        for (String name : names) {
            if (name.equals("..")) {
                if(!deque.isEmpty()){
                    deque.pollLast();
                }
            }else if(name.length() > 0 && !".".equals(name)){
                deque.offerLast(name);
            }
        }
        StringBuffer ans = new StringBuffer();
        if (deque.isEmpty()) {
            ans.append('/');
        } else {
            while (!deque.isEmpty()) {
                ans.append('/');
                ans.append(deque.pollFirst());
            }
        }
        return ans.toString();
    }
}
