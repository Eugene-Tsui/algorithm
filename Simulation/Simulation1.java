package Simulation;

public class Simulation1 {
    private static VPARecommender vpaRecommender;
    //计数
    private static int count = 0;
    private static int s4=0, s5=0, s0=0;
    public static void main(String[] args) {
        double[] loads = {
                0.03873, 0.02146, 0.03004, 0.65872, 1.26884, 0.02365, 0.0583, 0.03396,
                0.14031, 0.20859, 0.23556, 0.00582, 0.0406, 0.03523, 0.0777, 0.28897,
                0.10995, 0.02385, 3.88479, 1.0384, 0.03487, 0.58035, 9.73684, 0.11894,
                0.16403, 53.34154, 56.8517, 11.03776, 0.18369, 0.5180, 0.87536, 0.57765,
                9.51962, 0.10148, 0.05329, 0.06611, 0.02429, 0.00041, 0.00779, 0.4899,
                0.07776, 0.23403, 0.70942, 0.07169, 0.76652, 0.00788, 0.07994, 1.69443,
                7.4713, 6.15809, 0.0686, 0.00778, 0.13281, 0.05419, 0.71091, 0.03249,
                0.02591, 0.18583, 0.11757, 0.43765, 0.26709, 0.12359, 0.05809, 0.05878,
                0.09989, 0.03483, 0.0133, 0.02293, 0.03605, 0.01891, 2.47016, 0.02337,
                0.00605, 0.53074, 0.04261, 0.0103, 0.00585, 3.79548, 0.01932, 3.7854,
                0.00328, 0.45092, 4.65475, 4.90137, 0.01789, 3.65459, 0.02317, 0.04677,
                0.01588, 0.31334, 0.30503, 0.1142, 0.4332, 0.27138, 0.01844, 0.01584,
                1.57717, 0.06628, 0.04115, 0.02343, 0.172, 0.03605, 0.01891, 2.47016,
                0.02337, 0.00605, 0.53074, 0.04261, 0.0103, 0.00585, 3.79548, 0.01932,
                3.7854, 0.00328, 0.45092, 4.65475, 4.90137, 0.01789, 3.65459, 0.02317
        };

        double alpha = 2.5; // Weight coefficient

        for (int i = 1; i < loads.length; i++) {
            System.out.println();
            System.out.println("原始load："+loads[i]);
            double preLoad = loads[i-1];
            double load = loads[i];
            //计算缩放Score
            double score = alpha * (load-preLoad)/loads[i];
            //计算缩放后的目标值
            loads[i] = load = scalingDecision(preLoad, load ,score);
            System.out.println("推荐值："+load);
        }

        for (int i = 0; i < loads.length; i++) {
            System.out.println(loads[i]);
        }
        System.out.println("预测式缩放："+s4+" 反应式缩放："+s5+" 未缩放："+s0);

    }


    public static double scalingDecision(double preLoad, double load, double score) {
        load = VPARecommender.getLoad(load-preLoad, load);
        //预测式缩放
//        if (((0.6 < score && score < 2.0) || (-2.0 < score && score < 0.4))) {
//            System.out.printf("Score: %.2f -> 执行S4预测式缩放重新计算分配方案\n", score);
//            load = VPARecommender.getLoad(load-preLoad, load);
//            count = 0;
//            s4++;
//        }
//        //反应式缩放
//        else if ((score > 2.0 || score < -2.0) && count>0) {
//            System.out.printf("Score: %.2f -> 执行S5反应式缩放重新计算分配方案\n", score);
//            load = load*1.1;
//            count = 0;
//            s5++;
//        }
//        //停顿一次，预测式缩放
//        else if((score > 2.0 || score < -2.0) && count==0){
//            System.out.printf("Score: %.2f -> 执行S4预测式缩放重新计算分配方案\n", score);
//            load = VPARecommender.getLoad(load-preLoad, load);
//            count++;
//            s4++;
//        } else {
//            System.out.printf("Score: %.2f -> 不需要缩放\n", score);
//            load = preLoad;
//            s0++;
//        }
        return load;
    }
}
