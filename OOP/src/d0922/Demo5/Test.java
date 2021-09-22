package d0922.Demo5;

public class Test {
    public static void main(String[] args) {
        //向上转型
        Animal a =new Dog();
        a.eat();
        //向下转型
        //Cat c=(Cat)a;
        //c.catchMouse();
        //转换异常
        //Dog d=(Dog)a;
        //d.watchHouse();
        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.catchMouse();
        }else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.watchHouse();
        }
    }
}
