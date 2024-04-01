package Java;

import java.util.Scanner;

public class InversionCounter {

    // 计算逆序对
    public static int countInversions(int[] arr) {
        int invCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    // 计算每个位置元素取反后的逆序对数量
    public static void calculateF(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 复制数组并取反第 i 个元素
            int[] newArr = arr.clone();
            newArr[i] = -newArr[i];

            // 计算取反后的逆序对数量并输出
            System.out.print(countInversions(newArr) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取排列的大小
        int n = scanner.nextInt();

        // 读取排列的元素
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 计算函数 f(i) 的值并输出
        calculateF(arr);

        scanner.close();
    }
}