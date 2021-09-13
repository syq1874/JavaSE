package d0913;

import java.util.HashSet;

public class TestStudent {

    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(19,"lisi"));
        hs.add(new Student(20,"zhangsan"));
        hs.add(new Student(19,"lisi"));
        hs.add(new Student(18,"wangwu"));
        hs.add(new Student(19,"liuliu"));
        System.out.println(hs.size());
        System.out.println(hs);
        //自定义的类型不满足唯一不重复的特点
        //重写hashcode和equals方法后满足底层的原理
    }
}
