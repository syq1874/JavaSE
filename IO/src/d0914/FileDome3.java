package d0914;

import java.io.File;
import java.io.IOException;

public class FileDome3 {

    public static void main(String[] args) {
        File f2 =new File("D:\\syq");
        //System.out.println(f2.exists());      返回true
        Boolean flag1 = f2.exists();
        if(flag1){
            System.out.println("文件已存在！");
        }else{
            f2.mkdir();
            System.out.println("文件创建成功");
        }

        //获取文件的大小
        try {
            File f1 = new File("D:\\18020340230.txt");
            f1.createNewFile();
            System.out.println("文件的大小为:"+f1.length());
            System.out.println("文件名为："+f1.getName());
            System.out.println("文件路径为："+f1.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
