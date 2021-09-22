package d0922_2.Demo3;

public class MyDoor extends Door implements Bell,Lamp {
    @Override
    public void alarm() {
        System.out.println("当撬门的时候自动报警");
    }

    @Override
    public void light() {
        System.out.println("开门的时候自动亮灯，关门的时候自动关闭");
    }
}
