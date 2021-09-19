package d0919.Dome4;

public class Cat {
    String name;

    //无参构造函数
    public Cat() {

    }

    //有参构造函数
    public Cat(String name) {
        //电影成员属性
        this.name = name;
    }

    public void eat() {
        System.out.print(name);
        System.out.println("吃猫粮");
    }

    public void print() {
        //调用成员方法
        this.eat();
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.print();
        Cat c2 =new Cat("小花");
        c2.print();
    }
}
