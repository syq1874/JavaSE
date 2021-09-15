package d0915;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IODemo2 {

    public static void main(String[] args) {
        try {
            String data = "hello html";
            //append为true则追加，否则覆盖
            FileOutputStream fos = new FileOutputStream("D:\\181.txt",true);
            byte[] bytes=data.getBytes();
            fos.write(bytes);           //如果文件不存在就自动创建
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
