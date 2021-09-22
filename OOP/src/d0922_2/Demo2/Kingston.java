package d0922_2.Demo2;

public class Kingston implements USB {
    @Override
    public void read() {
        System.out.println("Kingston-U盘正在读取数据...");
    }

    @Override
    public void write() {
        System.out.println("Kingston-U盘正在写入数据...");
    }
}
