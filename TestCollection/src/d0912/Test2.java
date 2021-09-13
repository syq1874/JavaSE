package d0912;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        //在cc之后添加一个字符串kk
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            if("cc".equals(it.next())){
                it.add("kk");
            }
        }
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(list);
    }
}
