package d0922.Demo2;

public class Test {
    public static void main(String[] args) {
        //普通形式创建对象
        Cat cat = new Cat();
        Dog dog = new Dog();
        //
        //showCatEat(cat);
        //showDogEat(dog);

        showEat(cat);
        showEat(dog);
    }

    public static void showEat(Animal a) {
        a.eat();
    }

    /*public static void showCatEat(Cat cat) {
        cat.eat();
    }

    public static void showDogEat(Dog dog) {
        dog.eat();
    }*/
}
