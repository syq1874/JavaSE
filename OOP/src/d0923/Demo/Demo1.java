package d0923.Demo;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);      //int类型能表示的最大值
        System.out.println(Integer.MIN_VALUE);      //int类型能表示的最小值

        //通过构造方法创建Integer对象
        Integer i1= new Integer(123);
        Integer i2 =new Integer("123");         //字符串必须是数字类型

        //将字符串转换成基本类型
        String str ="20";
        int i3= Integer.parseInt(str);
        System.out.println(i3);

        String str2 ="10.5";
        float f= Float.parseFloat(str2);
        System.out.println(f);

        /*
            1.基本数据类型与""相加
            2.valueOf方法
            3.toString方法
         */
        String str3="123"+"";
        String str4=String.valueOf(123);
        String str5=Integer.toString(123);
        String str6=i1.toString();

        //包装类转换成基本数值
        int i=i2.intValue();
        System.out.println(i);

    }
}
