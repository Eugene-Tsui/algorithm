package Java;

import java.util.HashSet;

public class T202 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        set.add(n);
        while(n != 1){
            n = getSum(n);
            if(set.contains(n)){
                System.out.println(set);
                return false;
            }else{
                set.add(n);
            }
        }
        return true;

    }

    public static int getSum(int n){
        int res = 0;
        while(n!=0){
            int temp = n%10;
            res += temp*temp;
            n = n/10;
        }
        return res;
    }
}
