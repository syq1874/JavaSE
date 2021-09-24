package d0924.Demo4_Calendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        //Calendar calendar = Calendar.getInstance();
        Calendar cal = Calendar.getInstance();

        int year =cal.get(Calendar.YEAR);
        int month =(cal.get(Calendar.MONTH)+1);         //月份是从0-11
        int day =cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"/"+month+"/"+day);

        cal.add(Calendar.YEAR,2);       //年份增加两年
        System.out.println("年份为："+cal.get(Calendar.YEAR));

        cal.set(Calendar.YEAR,2019);            //设置年份
        System.out.println("年份为："+cal.get(Calendar.YEAR));

        System.out.println("今天是今年的第"+cal.get(Calendar.DAY_OF_YEAR)+"天");
        System.out.println("今天是这个月的第"+cal.get(Calendar.DAY_OF_MONTH)+"天");
    }
}
