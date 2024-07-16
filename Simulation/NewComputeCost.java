package Simulation;

public class NewComputeCost {
    public static void main(String[] args) {
        double[] nums= new double[]{
                2,
                2,
                2,
                2,
                2,
                2,
                2,
                2,
                3.6,
                3.6,
                2,
                2,
                10.3,
                10.3,
                2,
                56.3,
                56.3,
                12.8,
                12.8,
                2,
                2,
                2,
                13.3,
                13.3,
                2,
                2,
                2,
                2,
                2
        };
        int n = nums.length;
        double cost = 0;
        for (int i = 0; i < n; i++) {
            cost += nums[i]*0.23;
        }
        System.out.println("总成本为："+cost);


    }
}
