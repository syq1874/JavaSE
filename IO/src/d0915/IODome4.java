package d0915;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IODome4 {
    public static void main(String[] args) {
        try {
            long startTime=System.currentTimeMillis();
            //02 HelloWorld.mp4
            FileInputStream fis = new FileInputStream("D:\\英语四级资料\\词汇精讲\\1.mp4");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] car = new byte[1024*1024*512];
            int len = 0;
            while ((len=bis.read(car))!=-1){
                System.out.println(len);
            }
            bis.close();
            long end=System.currentTimeMillis();
            System.out.println("总费时:"+(end-startTime)+"ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
