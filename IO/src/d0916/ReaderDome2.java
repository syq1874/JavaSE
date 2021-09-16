package d0916;


import java.io.FileWriter;
import java.io.IOException;

public class ReaderDome2 {
    public static void main(String[] args) {
        try {
            String str = "java很简单";
            FileWriter fw = new FileWriter("D:\\182.txt");
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
