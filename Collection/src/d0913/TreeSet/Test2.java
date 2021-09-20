package d0913.TreeSet;

import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("elili");
        ts.add("alili");
        ts.add("dlili");
        ts.add("elili");
        ts.add("clili");
        ts.add("blili");
        System.out.println(ts.size());
        System.out.println(ts);
        //唯一，按从小到大的顺序输出

    }
}
