package d0911;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[] i={2,6,3,98,43};
        Test3 t3 = new Test3();
        t3.sort(i);
    }

}

class Test3{

    public void sort(int[] arr){
        Arrays.sort(arr);
        System.out.printf(Arrays.toString(arr));
    }
}
