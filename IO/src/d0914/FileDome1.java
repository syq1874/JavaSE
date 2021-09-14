package d0914;

import java.io.File;
import java.io.IOException;

public class FileDome1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("D:\\syq1874.txt");
            //创建一个普通文件
            Boolean flag1 = f1.createNewFile();
            System.out.println(flag1?"创建成功":"创建失败");
            //创建一个文件夹
            File f2 =new File("D:\\syq");
            Boolean flag2 = f2.mkdir();
            System.out.println(flag2?"创建文件夹成功":"创建文件夹失败");
            //创建一个多级文件夹
            File f3 =new File("D:\\syq_web\\html\\css");
            Boolean flag3 = f3.mkdirs();
            System.out.println(flag3?"创建多级文件夹成功":"创建多级文件夹失败");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
