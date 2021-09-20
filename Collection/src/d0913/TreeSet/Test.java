package d0913.TreeSet;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(17);
        ts.add(6);
        ts.add(7);
        ts.add(9);
        ts.add(6);
        ts.add(21);
        System.out.println(ts.size());
        System.out.println(ts);
        //唯一，按从小到大的顺序输出
    }
}
