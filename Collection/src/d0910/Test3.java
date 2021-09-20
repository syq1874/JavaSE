package d0910;


import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        //泛型出现在JDK1.5之后，在使用时才进行指明
        //加入泛型的优点，在编译时期会对类型进行检查，不是泛型对应的类型就不可以插入这个集合
        ArrayList<Integer> list = new ArrayList();
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(7);
        //list.add("add");
        //list.add(9.8);

        /*for(Object obj:list){
            System.out.println(obj);
        }*/

        for(Integer i:list){
            System.out.println(i);
        }
    }
}
