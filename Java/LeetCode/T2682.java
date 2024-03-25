package Java.LeetCode;


/*
输入：n = 5, k = 2
输出：[4,5]
解释：以下为游戏进行情况：
1）第 1 个朋友接球，第 1 个朋友将球传给距离他顺时针方向 2 步的玩家 —— 第 3 个朋友。
2）第 3 个朋友将球传给距离他顺时针方向 4 步的玩家 —— 第 2 个朋友。
3）第 2 个朋友将球传给距离他顺时针方向 6 步的玩家 —— 第 3 个朋友。
4）第 3 个朋友接到两次球，游戏结束。
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class T2682 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(Arrays.toString(circularGameLosers(n, k)));
    }

    public static int[] circularGameLosers(int n, int k) {
        boolean[] bool = new boolean[n];
        for (int i = k, j = 0; !bool[j]; i += k) {
            bool[j] = true;
            j = (j + i) % n;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(!bool[i]){
                list.add(i+1);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
