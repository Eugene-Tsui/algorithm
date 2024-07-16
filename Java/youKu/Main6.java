package Java.youKu;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] num = new long[n][2];
        for (int i = 0; i < n; i++) {
            num[i][0] = sc.nextLong();
            num[i][1] = sc.nextLong();
        }
        long max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (!judge(num[i], num[j], num[k])) {
                        long onSide = pointOnSide(num[i], num[j]) + pointOnSide(num[j],
                                num[k]) + pointOnSide(num[k], num[i]) - 3;
                        max = Math.max(max, onSide);
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static long pointOnSide(long[] p1, long[] p2) {
        long x = Math.abs(p1[0] - p2[0]);
        long y = Math.abs(p1[1] - p2[1]);
        return gcd(x, y) + 1;
    }
    public static long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return Math.abs(x);
    }

    public static boolean judge(long[] p1, long[] p2, long[] p3) {
        long x1 = p1[0], y1 = p1[1];
        long x2 = p2[0], y2 = p2[1];
        long x3 = p3[0], y3 = p3[1];

        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }
}
