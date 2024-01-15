package Java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TTestCode {

    public static int count = 1;    // 定义静态变量count

    public int method1() {

        // 实例方法method1

        count++;    // 访问静态变量count并赋值

        System.out.println("在静态方法 method1()中的 count="+count);    // 打印count

        return count;

    }

    public static int method2() {

        // 静态方法method2

        count += count;    // 访问静态变量count并赋值

        System.out.println("在静态方法 method2()中的 count="+count);    // 打印count

        return count;

    }

    public static void PrintCount() {

        // 静态方法PrintCount

        count += 2;

        System.out.println("在静态方法 PrintCount()中的 count="+count);    // 打印count

    }

    public int returnNum(){
        System.out.println("这是returnNum方法中的输出");
        return 1;
    }

    public static void main(String[] args) {

        Set<Integer> strSet = new HashSet<>();

        strSet.add(31);
        strSet.add(25);
        strSet.add(12);
        strSet.add(22);
        strSet.forEach(System.out::println);






    }

}

