package d0919.Demo6;

public class Test {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.setName("李四");
        s1.setAge(18);
        System.out.println(s1.getName()+"===="+s1.getAge());
        Student s2 = new Student("张三",18);
        System.out.println(s2.getName()+"===="+s2.getAge());

    }
}
