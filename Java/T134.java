package Java;

public class T134 {
    public static void main(String[] args) {
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        System.out.println(canCompleteCircuit(gas, cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost){
        int n = gas.length;
        int[] a = new int[n];
        int sum = 0;
        int start = 0;
        int all_money = 0;
        for (int i = 0; i < n; i++) {
            a[i] = gas[i] - cost[i];
            sum += a[i];
        }
        if(sum<0){
            return -1;
        }else {

            for (int i = 0; i < n; i++) {
                all_money += a[i];
                if(all_money<0){
                    all_money = 0;
                    start = i+1;
                }
            }
            return start;
        }

    }
}
