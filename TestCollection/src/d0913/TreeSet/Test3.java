package d0913.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        //利用外部比较器必须自己指定
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Student> ts = new TreeSet<>(com);//指定外部比较器，并按照外部比较器进行比较
        ts.add(new Student("blili",10));
        ts.add(new Student("elili",11));
        ts.add(new Student("alili",9));
        ts.add(new Student("clili",8));
        ts.add(new Student("dlili",11));
        System.out.println(ts.size());
        System.out.println(ts);


    }
}
