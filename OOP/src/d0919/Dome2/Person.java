package d0919.Dome2;

/*
    方法的重载
 */
public class Person {
    String name;
    public Person(){
        System.out.println("在家吃饭");
    }
    public Person(String name){
        this.name=name;
        System.out.println(name+"在家吃饭");
    }
    public Person(String name,String friend){
        this.name=name;
        System.out.println(name+"在"+friend+"家吃饭");
    }
}
