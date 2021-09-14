package d0914;

import java.io.File;

public class FileDome2 {
    public static void main(String[] args) {
        File f1 = new File("D:\\syq1874.txt");
        Boolean flag1=f1.delete();
        System.out.println(flag1?"文件删除成功":"文件删除失败");

    }
}
