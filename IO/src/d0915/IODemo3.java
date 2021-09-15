package d0915;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {

    public static void main(String[] args) {

        try {
            long startTime=System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("D:\\02 乱码问题.mp4");
            FileOutputStream fos = new FileOutputStream("D:\\1.mp4");
            int ch = 0;
            while ((ch=fis.read())!=-1){    //-1代表输出已无元素
                fos.write(ch);
            }
            fis.close();
            fos.close();
            long end=System.currentTimeMillis();
            System.out.println("总费时:"+(end-startTime));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
