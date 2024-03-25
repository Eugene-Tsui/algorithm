package Java.LeetCode;

public class T42 {
    public static void main(String[] args) {
        int[] height = { 4,2,0,3,2,5 };
        System.out.println("111:"+trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int num = 0;

        int[] dp1 = new int[n];
        dp1[0] = height[0];

        int[] dp2 = new int[n];
        dp2[n-1] = height[n-1];

        for (int i = 1; i < n; ++i) {
            dp1[i] = Math.max(height[i], dp1[i-1]);
        }
        for (int i = n-2; i >= 0; --i) {
            dp2[i] = Math.max(height[i], dp2[i+1]);
        }

        for (int i = 0; i < n; i++) {
                num += Math.min(dp1[i], dp2[i]) - height[i];
        }
        return num;
    }
}
