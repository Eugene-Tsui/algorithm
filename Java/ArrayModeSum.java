package Java;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayModeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取数组大小
        int n = scanner.nextInt();

        // 读取数组
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long sum = 0L;
        // 计算所有区间众数之和
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += findMode(arr, i, j);
            }
        }
        System.out.println(sum);
    }

    private static int findMode(int[] arr, int start, int end) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int mode = arr[start];
        int modeCount = 0;

        for (int i = start; i <= end; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
            if (countMap.get(arr[i]) > modeCount || (countMap.get(arr[i]) == modeCount && arr[i] < mode)) {
                mode = arr[i];
                modeCount = countMap.get(arr[i]);
            }
        }
        return mode;
    }
}