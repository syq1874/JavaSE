package d0919.Dome1;

/*
    构造方法定义原则
    1.方法名与类名相同
    2.没有返回值类型声明
    3.可以进行重载
 */
public class Dog {
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

    //无参构造方法
    public Dog(){
        name="大黄";
        health=99;
        love=98;
        stain="萨摩耶";
    }

    //有参的构造方法
    public Dog(String name,int health,int love,String stain){
        this.name=name;
        this.health=health;
        this.love=love;
        this.stain=stain;
    }
}
