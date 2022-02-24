package learnDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间对象和字符串之间的互相转化
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * */

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        // 把时间对象按照 “格式字符串指定的格式” 转成相应的字符串, Date -> String
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date());
        System.out.println(str);

        // 把字符串按照 “格式字符串指定的格式” 转成相应的时间对象, String -> Date
        DateFormat df2 = new SimpleDateFormat("yyyyMMdd");
        Date d = df2.parse("20200519");
        System.out.println(d);
    }
}
