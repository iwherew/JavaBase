package learnDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        // 获得日期的相关元素
        Calendar calendar = new GregorianCalendar(2020,8,1); // 2020.09.01
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // 月 0-11
        int day = calendar.get(Calendar.DATE); // 日 或者 DAY_OF_MONTH
        int weekday = calendar.get(Calendar.DAY_OF_WEEK); // 星期几 1-7， 1：星期日, 2：星期一

        System.out.println(year);
        System.out.println(month);

        // 设置日期的相关元素
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.YEAR, 3000);

        // 日期的计算
        Calendar c3 = new GregorianCalendar();
        c3.add(Calendar.DATE, 100); // 往后100天
        c3.add(Calendar.YEAR, -100); // 往前100年
        System.out.println(c3);

        // 日期对象和时间对象转化
        // Calendar -> Date
        Date d4 = c3.getTime();
        // Date -> Calendar
        Calendar c4 = new GregorianCalendar();
        c4.setTime(d4);

        System.out.println(printCalendar(new GregorianCalendar()));
    }

    public static String printCalendar(Calendar c){
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);

        return year + "-" + month + "-" + date;
    }
}
