package d0916;

public class ArratTest {
    public static void main(String[] args) {
        //静态初始化
        int[] ids;
        ids = new int[]{1001, 1002, 1003, 1004};
        //动态初始化
        String[] names = new String[5];

        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "武松";
        names[4] = "林冲";
        //获取数组的长度
        System.out.println(names.length);
        System.out.println(ids.length);
        //遍历数组
        System.out.println("====普通for循环====");
        for (int i =0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("====增强for循环====");
        for(String n:names){
            System.out.println(n);
        }
    }
}
