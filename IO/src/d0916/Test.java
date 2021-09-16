package d0916;

import java.io.*;

public class Test {
    public static void main(String[] args)  {
        try{
            long startTime=System.currentTimeMillis();
            //2.获取输出流，向服务端发送信息
            //字节输出流
            //FileOutputStream os =new FileOutputStream("D:\\18.txt");
            //将输出流包装成打印流
            //PrintWriter pw = new PrintWriter(os);

            //3.获取输入流，读取文件中的信息
            //文件输入流
            InputStream in = new FileInputStream("D://a.txt");
            InputStreamReader isr = new InputStreamReader(in,"utf-8");
            BufferedReader br = new BufferedReader(isr);
            String str = null;

            while((str = br.readLine())!=null){
                System.out.println("文件读取内容为： "+str);
                //pw.write(str+"\r\n");
                //pw.flush();
                //等待时间
                //Thread.sleep(1000);
            }

            //pw.close();
            br.close();
            in.close();
            //os.close();
            long end=System.currentTimeMillis();
            System.out.println("总费时:"+(end-startTime)/1000+"s");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
