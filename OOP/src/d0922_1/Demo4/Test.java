package d0922_1.Demo4;
/*
    1.成员变量
        编译时看左边，左边有成员变量编译通过。如果没有报错
        运行时看左边，输出父类的结果
    2.成员方法
        编译时看左边，左边有成员方法编译通过。如果没有报错
        运行时看右边，输出子类的结果(子类重写父类)
 */
public class Test {
    public static void main(String[] args) {
        //创建子类，使用多态创建
        Father father =new Son();       //编译时看左边，左边有成员变量编译通过。如果没有报错
        System.out.println(father.age);
        father.teach();
        //father.playGame();      成员方法编译看左边，左边有成员方法编译通过。如果没有报错
    }
}
