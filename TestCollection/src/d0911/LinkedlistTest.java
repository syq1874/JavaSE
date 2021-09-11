package d0911;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedlistTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaaaa");
        list.add("bbbbbbb");
        list.add("ccccccc");
        list.add("ddddddd");
        list.add("eeeeeee");
        list.add("bbbbbbb");
        //可以添加重复数据
        //向首部添加元素
        list.addFirst("ffff");
        //向尾部添加元素
        list.addLast("ggggggg");
        //向尾端添加元素
        list.offer("kk");
        list.offerFirst("jjj");
        list.offerLast("hhh");
        System.out.println(list);
        //删除头部元素
        list.poll();
        //删除头部元素 list.pollFirst();==>即使集合为空也不会报错   list.removeFirst();==>如果集合为空会报错
        //删除尾部元素 list.pollLast();==>即使集合为空也不会报错     list.removeLast();==>如果集合为空会报错
        System.out.println(list);

        //遍历集合   普通for循环
        System.out.println("================遍历集合   普通for循环================");
        for(int i = 0 ;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        //遍历集合   增强for循环
        System.out.println("==================遍历集合   增强for循环==============");
        for(Object obj:list) {
            System.out.println(obj);
        }

        System.out.println("==================遍历集合   迭代器==============");
        Iterator it=list.iterator();
        while (it.hasNext()/* 存在下一个元素就将他输出出来 */) {
            System.out.println(it.next());
        }
        System.out.println("==================遍历集合   迭代器2==============");
        for(Iterator<String> it1=list.iterator();it1.hasNext();){
            System.out.println(it1.next());
        }






    }
}
