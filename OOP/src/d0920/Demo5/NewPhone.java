package d0920.Demo5;

public class NewPhone extends Phone {
    public void showNum(){
        super.showNum();
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}
