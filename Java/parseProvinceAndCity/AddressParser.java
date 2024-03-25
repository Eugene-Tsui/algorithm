package Java.parseProvinceAndCity;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressParser {

    public static String parseProvinceAndCity(String address) {
        String regex = "(?<province>[^省]+省|.+自治区|.+直辖市|[^澳门]+澳门|[^香港]+香港)?(?<city>[^市]+市|[^地区]+地区|[^盟]+盟)?(?<county>[^县]+县|[^市]+市|[^区]+区)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        String province = "";
        String city = "";

        if (matcher.find()) {
            province = matcher.group("province") != null ? matcher.group("province") : "";
            city = matcher.group("city") != null ? matcher.group("city") : "";
        }

        return province + city;
    }

    public static void main(String[] args) {
        //多线程程序，分别解析多个地址的省市信息
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        List<String> addresses = Arrays.asList(
                "湖北省武汉市洪山区珞瑜路光谷广场",
                "北京市朝阳区建国路88号",
                "浙江省杭州市西湖区",
                "广东省深圳市南山区科技园"
        );
        for (String address : addresses) {
            executorService.submit(() -> {
                String result = parseProvinceAndCity(address);
                System.out.println(Thread.currentThread().getName() + " 解析的地址： " + result);
            });
        }

        executorService.shutdown();

        try {
            // 等待所有提交的任务执行完毕
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                // 如果超时了仍然没有终止，强制关闭
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            // 如果当前线程被中断，强制关闭线程池
            executorService.shutdownNow();
        }

    }
}
