package d0923.Demo;

public class Demo3 {
    public static void main(String[] args) {
        int num=10;
        Integer number=Integer.valueOf(num);   //手动装箱
        System.out.println(number);
        int num2=number.intValue();            //手动拆箱
        System.out.println(num2);
    }
}
