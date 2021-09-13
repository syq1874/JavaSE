package d0913;

import java.util.HashSet;

public class TestString {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("apple");
        hs.add("html");
        hs.add("apple");
        hs.add("css");
        hs.add("json");
        System.out.println(hs.size());  //不重复
        System.out.println(hs);         //无序
    }
}
