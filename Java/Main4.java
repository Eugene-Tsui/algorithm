package Java;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countOnes(n));
    }

    public static int countOnes(int n) {
        // 确保n在0到1000之间
        if (n < 0) {
            n = 0;
        } else if (n > 1000) {
            n = 1000;
        }

        int count = 0;
        // 遍历1到5n之间的所有整数
        for (int i = 1; i <= 5 * n; i++) {
            int number = i;
            // 检查每个数字是否包含1
            while (number > 0) {
                if ((number % 10) == 1) {
                    count++;
                }
                number /= 10; // 移动到下一个数字
            }
        }
        return count;

    }
}
