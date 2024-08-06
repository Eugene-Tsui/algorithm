package org.example;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VPARecommenderSimulator {

    private static final int MIN_CPU = 100; // 最小 CPU 资源限制（毫核）
    private static final int MAX_CPU = 1000; // 最大 CPU 资源限制（毫核）
    private static final int MIN_MEMORY = 200; // 最小内存资源限制（MiB）
    private static final int MAX_MEMORY = 2048; // 最大内存资源限制（MiB）
    private static final int NUM_SAMPLES = 100; // 每个周期的样本数量
    private static final int NUM_PERIODS = 5; // 总周期数

    public static void main(String[] args) {
        List<Double> cpuUsageHistory = new ArrayList<>();
        List<Double> memoryUsageHistory = new ArrayList<>();

        for (int period = 1; period <= NUM_PERIODS; period++) {
            System.out.println("Period " + period + ":");

            // 每个周期收集数据
            for (int i = 0; i < NUM_SAMPLES; i++) {
                cpuUsageHistory.add(generateRandomCpuUsage());
                memoryUsageHistory.add(generateRandomMemoryUsage());
            }

            // 计算推荐资源值
            double recommendedCpu = calculateRecommendedResource(cpuUsageHistory, 95);
            double recommendedMemory = calculateRecommendedResource(memoryUsageHistory, 95);

            // 应用资源限制
            recommendedCpu = Math.max(MIN_CPU, Math.min(recommendedCpu, MAX_CPU));
            recommendedMemory = Math.max(MIN_MEMORY, Math.min(recommendedMemory, MAX_MEMORY));

            // 打印推荐资源值
            System.out.println("Recommended CPU: " + recommendedCpu + " mCPU");
            System.out.println("Recommended Memory: " + recommendedMemory + " MiB");

            // 重置数据，为下一个周期做准备
            cpuUsageHistory.clear();
            memoryUsageHistory.clear();
        }
    }

    private static double generateRandomCpuUsage() {
        Random random = new Random();
        double usage = random.nextDouble() * (MAX_CPU - MIN_CPU) + MIN_CPU; // 随机生成 CPU 使用率
        System.out.println(usage);
        return usage; // 随机生成 CPU 使用率
    }

    private static double generateRandomMemoryUsage() {
        Random random = new Random();
        return random.nextDouble() * (MAX_MEMORY - MIN_MEMORY) + MIN_MEMORY; // 随机生成内存使用量
    }

    private static double calculateRecommendedResource(List<Double> resourceUsageHistory, int percentile) {
        Collections.sort(resourceUsageHistory);

        int index = (int) Math.ceil((percentile / 100.0) * resourceUsageHistory.size() - 1);
        return resourceUsageHistory.get(index);
    }
}