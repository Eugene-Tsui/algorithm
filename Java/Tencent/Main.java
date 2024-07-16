package Java.Tencent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        if(n-m>2){
            System.out.println(0);
        }

        Set<Long> set1 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            long node1 = sc.nextLong();
            long node2 = sc.nextLong();

            if(set1.isEmpty()){
                set1.add(node1);
                set1.add(node2);
            }else if(set1.contains(node1)){
                set1.add(node2);
            }
        }
        long num1 = set1.size();
        long num2 = n-num1;
        System.out.println(num1*num2);

    }
}
