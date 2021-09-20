package d0911;


//自定义泛型类
public class GenericTest<E> {
    int age;
    String name;
    E sex;
    public void a(E n) {
    }

    public void b(E[] m) {
    }
}

class Test{
    public static void main(String[] args) {
        //GenericTest进行泛型
        //如果实例化时不明确指定泛型，则认为此泛型为Object类型
        GenericTest gt1 =new GenericTest();
        gt1.a(9);
        gt1.a(9.8);
        gt1.a("add");
        gt1.b(new String[]{"a","b","c"});

        //实例化时明确指定泛型 ==>推荐方式
        GenericTest<String> gt2 =new GenericTest<>();
        gt2.sex="男";
        gt2.a("add");
        gt2.b(new String[]{"a","b","c"});

    }

}

class SubGenericTest extends GenericTest<Integer>{
}

class Demo{
    public static void main(String[] args) {
        SubGenericTest sgt = new SubGenericTest();
        //父类指定泛型，子类就不需要指定泛型了，可以直接使用
        sgt.a(9);
    }
}

class SubGenericTest2<E> extends GenericTest<E>{}

class Demo2{
    public static void main(String[] args) {
        SubGenericTest2<String> sgt2 = new SubGenericTest2<>();
        sgt2.a("add");
        sgt2.sex  = "女";
    }
}


