package d0919.Demo6;

public class Student {
    //成员变量
    private String name;
    private int age;
    //成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println();
    }
}
