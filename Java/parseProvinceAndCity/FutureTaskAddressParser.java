package Java.parseProvinceAndCity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FutureTaskAddressParser {

    private static final Pattern pattern = Pattern.compile(
            "(?<province>[^省]+省|.+自治区|.+直辖市|[^澳门]+澳门|[^香港]+香港)?(?<city>[^市]+市|[^地区]+地区|[^盟]+盟)?"
    );

    private static String parseProvinceAndCity(String address) {
        Matcher matcher = pattern.matcher(address);
        if (matcher.find()) {
            String province = matcher.group("province") != null ? matcher.group("province") : "";
            String city = matcher.group("city") != null ? matcher.group("city") : "";
            return province + city;
        }
        return "地址格式不正确";
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<String> addresses = Arrays.asList(
                "湖北省武汉市洪山区珞瑜路光谷广场",
                "北京市朝阳区建国路88号",
                "浙江省杭州市西湖区",
                "广东省深圳市南山区科技园"
        );

        // 存储FutureTask的列表
        List<FutureTask<String>> futureTasks = new ArrayList<>();

        // 为每个地址创建一个FutureTask并提交到线程池
        for (String address : addresses) {
            FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
                @Override
                public String call() {
                    return parseProvinceAndCity(address);
                }
            });
            futureTasks.add(futureTask);
            executorService.submit(futureTask);
        }

        // 等待所有的FutureTask完成并获取结果
        for (FutureTask<String> task : futureTasks) {
            try {
                // get() 方法将阻塞，直到任务执行完毕
                String result = task.get();
                System.out.println("解析的地址： " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // 关闭线程池
        executorService.shutdown();
        try {
            // 等待线程池中的所有任务完成
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            executorService.shutdownNow();
        }
    }
}