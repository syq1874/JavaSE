package d0922_2.Demo;

public class Rectangle extends Shape {
    double width;
    double length;

    //子类必须重写抽象类方法，如果不重写，子类必须是抽象的
    @Override
    public double getArea() {
        System.out.println("长方形的面积是:"+width*length);
        return width*length;
    }

    public Rectangle() {
        super();
    }

    public Rectangle(String shapeName,double width,double length) {
        super(shapeName);
        this.length=length;
        this.width=width;
    }
}
