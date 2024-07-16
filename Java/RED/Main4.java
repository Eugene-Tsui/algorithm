package Java.RED;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigDecimal n1 = new BigDecimal(n);
        BigDecimal n2 = new BigDecimal(n-1);
        BigDecimal under = n1.multiply(n2);
        BigDecimal on = new BigDecimal(2);

        BigDecimal res = on.divide(under, 10, RoundingMode.HALF_UP);
        System.out.println(res.toPlainString());
    }
}
