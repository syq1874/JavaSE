package d0916;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        System.out.println(arr[1][1]);
        System.out.println(arr2[1][1]);
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}
