package Java;

import java.util.ArrayList;
import java.util.UUID;

public class TTestCode {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            new Thread(()->{
                list.add("1");
                System.out.println(list);
            },
                    String.valueOf(i)).start();
        }
    }
}
