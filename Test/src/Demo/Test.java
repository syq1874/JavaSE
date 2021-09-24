package Demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String str ="abcde";
        ArrayList list =new ArrayList();
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(list.size()-i-1));
        }
    }
}
