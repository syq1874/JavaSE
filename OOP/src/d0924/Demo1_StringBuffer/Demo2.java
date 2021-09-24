package d0924.Demo1_StringBuffer;

public class Demo2 {
    public static void main(String[] args) {
        //String 耗时
        long beginTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String耗时:" + (endTime - beginTime));

        beginTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer耗时:" + (endTime - beginTime));
    }
}

/*
    String耗时:387
    StringBuffer耗时:1
    证明如果经常对字符串进行修改，使用StringBuffer性能优于String
 */
