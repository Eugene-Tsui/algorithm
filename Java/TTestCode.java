package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,0);

        ArrayList<Integer> list1 = (ArrayList<Integer>) list.clone();

        list.set(0,2);
        System.out.println(list);
        System.out.println(list1);


    }

}

