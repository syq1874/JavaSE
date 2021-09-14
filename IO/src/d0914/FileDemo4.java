package d0914;

import java.io.File;

public class FileDemo4 {
    public static void showFile(String pathname) {
        long startTime=System.currentTimeMillis();
        File f1 = new File(pathname);
        //判断文件是否为文件夹
        boolean flag1 = f1.isDirectory();
        //选择某个文件夹下的所有文件
        if (flag1) {//是文件夹就返回文件夹下的所有文件
            File[] files = f1.listFiles();
            for(int i = 0;files!=null&& i<files.length;i++) {
                boolean flag2 = files[i].isDirectory();
                if (flag2) {
                    showFile(files[i].getPath());
                } else {
                    System.out.println("普通文件，文件的路径为：" + f1.getPath());
                }
            }
        } else {//否则返回文件路径
            System.out.println("普通文件，文件的路径为：" + f1.getPath());
        }
        long end=System.currentTimeMillis();
        System.out.println("总费时:"+(end-startTime));
    }

    public static void main(String[] args) {
        FileDemo4.showFile("D:\\18020340230");
    }
}
