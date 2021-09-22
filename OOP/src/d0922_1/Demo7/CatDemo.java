package d0922_1.Demo7;

//引用类型的变量值为对象地址值，不能更改，但地址内的对象属性值可以更改
public class CatDemo {
    public static void main(String[] args) {
        final  Cat cat =new Cat();
        cat.age=12;
        cat.name="小黑";
        //cat =new Cat();       更改地址值报错
    }
}
