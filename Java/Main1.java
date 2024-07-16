package Java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

class Main1 {
    public static void main(String[] args) {
        int[] aster = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(aster)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int n = asteroids.length;
        for(int i = 0; i < n; i++) {
            if(asteroids[i] < 0) {
                while(!deque.isEmpty()) {
                    int top = deque.peekLast();
                    if(top <= Math.abs(asteroids[i])) {
                        deque.poll();
                        if(top == Math.abs(asteroids[i])) {
                            asteroids[i] = 0;
                            break;
                        }
                    } else {
                        asteroids[i] = 0;
                        break;
                    }
                }
                if(asteroids[i] < 0) res.add(asteroids[i]);
            } else {
                deque.add(asteroids[i]);
            }
        }
        while(!deque.isEmpty()) {
            res.add(deque.peekFirst());
            deque.pollFirst();
        }
        int[] res1 = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            res1[i] = res.get(i);
        }
        return res1;
    }
}