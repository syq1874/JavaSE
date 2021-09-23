package d0923.Demo2;
/*
    字符串是常量，不能更改
    String是被final修饰的，不能更改
 */
public class Demo2 {
    public static void main(String[] args) {
        String s="hello";
        s+=" World";
        System.out.println(s);
    }
}
