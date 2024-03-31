package Java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3};
        //根据新数组的大小得到组合个数
        pailie_swap(0,0, arr,new int[2]);

    }

    public static void pailie_swap(int n,int index, int[] arr, int[] newArr) {
        //新数组赋值完毕推出递归
        if (n == newArr.length) {
            System.out.println(Arrays.toString(newArr));
            return;
        }
        //此处的for循环是改变原数组起始排序组合的下标。
        // arr.length - i >=  newArr.length - n 是优化条件，如果后续剩余的个数不满足组合的数量，则不继续（比如3个数组排序组合个数为3的只会循环一次）
        for (int i = index; i < arr.length && arr.length - i >=  newArr.length - n; i++) {
            //由于不考虑顺序，只需要将原数组的值直接赋值
            newArr[n] = arr[i];
            //赋值余下的
            pailie_swap(n + 1,i + 1, arr, newArr);
        }
    }
}
