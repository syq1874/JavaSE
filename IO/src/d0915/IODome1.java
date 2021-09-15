package d0915;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IODome1 {
    public static void main(String[] args) {
        try {
            //FileInputStream fit = new FileInputStream("D:\\a.txt");
            //等价
            File f1 = new File("D:\\18.txt");
            if(f1.exists() &&f1.length()>0){
                FileInputStream fis = new FileInputStream(f1);
                int ch = 0;
                while ((ch=fis.read())!=-1){    //-1代表输出已无元素
                    System.out.print((char)ch);
                }
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("文件找不到！");
        }
    }
}
