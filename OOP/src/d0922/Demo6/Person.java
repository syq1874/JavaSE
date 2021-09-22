package d0922.Demo6;

public class Person {
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;     //判断是否为同一个对象
        //判断传进来的对象是否为Person类型
        if(!(o instanceof Person)){
            return false;
        }
        //将o向下转型为Person
        Person p =(Person)o;
        return this.age==p.age;

    }


}
