import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        String str="abcde";
        ArrayList list=new ArrayList();
        for (int i=0;i<str.length();i++){
            list.add(str.substring(i,i+1));
        }
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(list.size()-i-1));
        }
    }
}
