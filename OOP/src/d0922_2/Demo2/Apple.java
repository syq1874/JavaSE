package d0922_2.Demo2;

public class Apple implements USB,A {
    @Override
    public void read() {
        System.out.println("Apple正在读数据");
    }

    @Override
    public void write() {
        System.out.println("Apple正在写数据");
    }
}
