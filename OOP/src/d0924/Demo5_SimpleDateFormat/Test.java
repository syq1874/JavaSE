package d0924.Demo5_SimpleDateFormat;

import java.text.ParseException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        String str =Demo3.dateToString(date);
        System.out.println(str);

        Date date2 =Demo3.StringToDate(str);
        System.out.println(date2);
    }
}
