package d0922_2.Demo2;

public class Test {
    public static void main(String[] args) {
        USB usb;
        usb =new Kingston();
        usb.read();
        usb.write();

        usb=new Apple();
        usb.read();
        usb.write();
    }
}
