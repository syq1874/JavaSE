package d0922_1.Demo6;

public class Test {
    public static void main(String[] args) {
        Car car =new Car();
        car.name="奔驰";
        car.price=1000000;
        System.out.println(car.toString());
        Car car2 =new Car();
        car2.name="奔驰";
        car2.price=1000000;
        System.out.println(car.equals(car2));
    }
}
