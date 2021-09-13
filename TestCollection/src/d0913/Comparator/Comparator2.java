package d0913.Comparator;

import java.util.Comparator;

public class Comparator2 {
    public static void main(String[] args) {
        Student s1= new Student(10,"lisi");
        Student s2= new Student(10,"lili");
        //内部比较器
        //System.out.println(s1.compareTo(s2));
        //外部比较器
        //Comparator bj1 = new BiJiao01();
        Comparator bj1 = new BiJiao03();
        System.out.println(bj1.compare(s1, s2));
    }
}
