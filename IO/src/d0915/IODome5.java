package d0915;

import java.io.*;

public class IODome5 {
    public static void main(String[] args) {
        try {
            long startTime=System.currentTimeMillis();
            //02 HelloWorld.mp4
            FileInputStream fis = new FileInputStream("D:\\英语四级资料\\词汇精讲\\1.mp4");
            BufferedInputStream bis = new BufferedInputStream(fis);
            OutputStream fos = new FileOutputStream("D:\\1.mp4");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] car = new byte[1024*1024];
            int len = 0;
            while ((len=bis.read(car))!=-1){
                bos.write(car,0,len);
            }
            bis.close();
            bos.close();
            long end=System.currentTimeMillis();
            System.out.println("总费时:"+(end-startTime)+"ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
