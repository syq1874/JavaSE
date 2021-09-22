package d0922.Demo6;

public class Test2 {
    public static void main(String[] args) {
        Person person =new Person();
        person.age=10;

        Person person1 =new Person();
        person1.age=18;
        System.out.println(person.equals(person));
        System.out.println(person.equals(person1));
    }
}
