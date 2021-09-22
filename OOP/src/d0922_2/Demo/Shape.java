package d0922_2.Demo;

public abstract class Shape {
    String shapeName;

    public Shape() {

    }
    public Shape(String shapeName) {
        super();
        this.shapeName=shapeName;
    }

    public abstract double getArea();

    public void show(){
        System.out.println("正在操作的图形"+shapeName);
    }

}
