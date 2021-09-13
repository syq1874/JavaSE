package d0913;

import java.util.HashSet;

public class TestInteger {

    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        System.out.println(hs.add(9));
        hs.add(4);
        hs.add(20);
        hs.add(41);
        hs.add(0);
        System.out.println(hs.add(9));
        System.out.println(hs.size());  //不重复
        System.out.println(hs);         //无序
    }
}
