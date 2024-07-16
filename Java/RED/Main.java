package Java.RED;

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int num=0;
        Map<Integer, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            if(!map.containsValue(str)){
                map.put(num++, str);
            }
        }
        for (int i = 0; i <= num; i++) {
            System.out.println(map.get(i));
        }
    }
}