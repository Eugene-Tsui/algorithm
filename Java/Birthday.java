package Java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Birthday {
    public static void main(String[] args) {
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        String str1 = "1997-12-12";
        String str2 = "2025-04-29";
        try {
            Date star = dft.parse(str1);//开始时间
            Date endDay=dft.parse(str2);//结束时间
            Date nextDay=star;
            int i=0;
            while(nextDay.before(endDay)){//当明天不在结束时间之前是终止循环
                Calendar cld = Calendar.getInstance();
                cld.setTime(star);
                cld.add(Calendar.DATE, 1);
                star = cld.getTime();
                //获得下一天日期字符串
                nextDay = star;
                i++;
            }
            System.out.println(str1+" 和 "+str2);
            System.out.println("相差天数为："+i);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
