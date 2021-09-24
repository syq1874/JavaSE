package d0924.Demo;

public class Demo {
    public static void main(String[] args) {
        //创建一个空的stringbuffer
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("aa");       //创建一个容器并添加字符串
        sb.append("abc");
        sb.append('d');
        sb.append(true);
        sb.append(new Object());
        sb.append(123.0d);
        sb.append(456.7f);
        System.out.println(sb);
        System.out.println(sb.toString());          //将StringBuffer对象转为String对象
        sb1.append(123).append("abc").append(true); //链式写法
        System.out.println(sb1);
        String str = new String("abcdf");
        StringBuffer sb2=new StringBuffer(str);
        sb2.reverse();          //反向输出
        System.out.println(sb2.toString());
    }
}
