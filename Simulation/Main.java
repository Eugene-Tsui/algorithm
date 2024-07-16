package Simulation;

public class Main {
    public static void main(String[] args) {

        //获取当前时间
        double cur = System.currentTimeMillis();
        //获取初始时间
        double start = System.currentTimeMillis()-1000;

        // 定义负载
        double tau = 1000.0;

        // 定义常数
        double lambda = 0.1; // 常数

        System.out.println("(cur - start) / lambda: "+(cur - start) / lambda);
        // 计算公式 ζ = 2^((τ - τ0) / λ)
        double zeta = Math.pow(2, (cur - start) / lambda);

        // 输出结果
        System.out.println("ζ = " + zeta);

        System.out.println("现在的负载："+ tau*zeta);
    }
}