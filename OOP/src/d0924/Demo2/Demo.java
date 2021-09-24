package d0924.Demo2;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.nextBoolean());
        System.out.println(r1.nextDouble());
        System.out.println(r1.nextFloat());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextInt(100));
        System.out.println("================================");
        Random r2 = new Random(100);
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextFloat());
        System.out.println(r2.nextInt());
        System.out.println(r2.nextInt(100));
    }
}
