package d0916;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderDome1 {
    public static void main(String[] args) {
        try {
            FileReader fr =new FileReader("D:\\18.txt");
            char[] car = new char[1024];
            int len = 0;
            while ((len=fr.read())!=-1){
                String str = new String(car,0,len);
            }
            fr.read(car);
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
