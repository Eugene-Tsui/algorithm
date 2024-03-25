package Java.LeetCode;

public class T121 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int res = 0;
        for(int i=1; i<prices.length; i++){
            res += Math.max(prices[i] - prices[i-1], 0);
        }
        return 0;
    }
}
