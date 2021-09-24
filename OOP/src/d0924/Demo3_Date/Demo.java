package d0924.Demo3_Date;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d1 =new Date();        //获取系统当前时间
        //返回字符串的固定格式
        System.out.println(d1.toString());

        //返回自1970年1月1日以来，由此 Date对象表示的00:00:00 GMT的毫秒数 。
        long time =d1.getTime();
        System.out.println("自1970年1月1日相隔"+time+"ms");

        Date d2=new Date();
        d2.setTime(1632474155613L);
        //Date d2=new Date(1632474155613L);
        System.out.println(d2.toString());

    }
}
