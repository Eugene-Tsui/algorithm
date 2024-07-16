package Simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VPARecommender {

    // 安全系数
    public static final double safeNum = 0.15;

    // N表示被覆盖的Pod数量
    public static final double N = 2;

    // 最小CPU使用量
    public static final double p = 50;

    // 权重
    public static final double lambda = 0.9;


    public VPARecommender() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 负载个数
        int n = scanner.nextInt();

        // 当前缩放后的负载值
        double curLoad=0;

        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextDouble());
        }
        //遍历负载并处理
        for (int i = 1; i < n; i++) {
            //计算当前负载值推荐值
            System.out.println(list.get(i));
            curLoad = getLoad(list.get(i)-curLoad, curLoad);
        }
    }

    public static double getLoad(double loadDiff, double curLoad) {
        // 将负载差值乘以权重
        loadDiff*=lambda;

        // 将负载差值累加到当前负载值上
        curLoad+=loadDiff;

        System.out.println( "load差: "+loadDiff+" curLoad: "+curLoad);
        // 计算推荐值
        return curLoad;
    }

}
