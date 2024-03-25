package Java.LeetCode;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class T20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(stack.empty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }else if(s.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(s.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
