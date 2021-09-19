package d0919.Dome;

public class Dog{
    //成员变量，定义属性
    String name;
    int health;
    int love;
    String stain;

    //定义成员方法
    public void print(){
        System.out.println("狗的自述：我叫"+name+",我的健康值"+health+
                ",我和主人的亲密度"+love+",我的品种是"+stain);
    }

    public void run(){
        System.out.println("欢快的跑!!!");
    }
}
