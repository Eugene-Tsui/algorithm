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

    static class newDeque extends ArrayDeque{
        private void hello(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
//        Deque<Character> deque = new ArrayDeque<>();
//        deque.isEmpty();
//        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add()/arrayList.remove()/arrayList.get()/arrayList.set();
//
//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.get()/linkedList.add()/linkedList.remove();
//
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        hashMap.get()/hashMap.remove()/hashMap.put()/hashMap.containsKey();




    }

}

