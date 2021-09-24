package d0924.Demo5_SimpleDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date =df.parse("2021-09-24 19:22:55");
        System.out.println(date.toString());
        System.out.println(df.format(date));
    }
}
