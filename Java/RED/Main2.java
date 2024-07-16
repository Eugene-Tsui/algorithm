package Java.RED;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, (b,c)->Integer.compare(c[1], b[1]));
        PriorityQueue<Integer> pri = new PriorityQueue<>();
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            pri.offer(a[i][0]);
            sum += a[i][0];
            if(i >= k-1){
                ans = Math.max(ans, sum*a[i][1]);
                sum -= pri.poll();
            }

        }
        System.out.println(ans);


    }
}
