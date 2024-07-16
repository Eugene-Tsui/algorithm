package Java.HUAWEI;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(stack.isEmpty()){
                stack.addLast(s);
            }else{
                //上一个
                if(stack.peekLast().equals(s)){
                    stack.pollLast();
                    //上两个
                    if(!stack.isEmpty() && stack.peekLast().equals(s)){
                        stack.pollLast();
                    }else{
                        stack.addLast(s);
                        stack.addLast(s);
                    }
                }else{
                    stack.addLast(s);
                }
            }
        }

        if(stack.isEmpty()){
            System.out.println(0);
        }else{
            int m = stack.size()-1;
            for (int i = 0; i < m; i++) {
                System.out.print(stack.pollFirst()+" ");
            }
            System.out.print(stack.pollFirst());
        }

    }
}
