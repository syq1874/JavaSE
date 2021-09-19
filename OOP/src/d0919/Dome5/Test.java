package d0919.Dome5;
/*
    被static修饰的成员变量属于类，不属于这个类的某个对象
    被static修饰的成员变量和方法调用
    1.创建对象  方法名.属性      对象名.方法名
    2.类名直接调用 属性或者方法

    静态的内容优于对象，不能使用this super
    同一个类中，静态成员只能访问静态成员
 */
public class Test {
    public static void main(String[] args) {
        Demo d1 =new Demo();
        Demo d2 =new Demo();
        d1.num=100;
        Demo.num=300;
        System.out.println(d1.num);
        System.out.println(d2.num);
        System.out.println(Demo.name);
        System.out.println(d1.name);
    }
}
