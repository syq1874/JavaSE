package d0922.Demo3;

public class Test {
    public static void main(String[] args) {
        /*
            Animal d = getDoll(200);
            d.eat();
            Animal c = getDoll2(100);
            c.eat();
        */
        Animal dog =getDoll(200);
        dog.eat();


        Animal cat =getDoll(5);
        cat.eat();
    }

    public static Animal getDoll(int num) {
        if (num > 20) {
            Dog dog = new Dog();
            return dog;
        } else if (num < 20) {
            Cat cat = new Cat();
            return cat;
        }
        return null;
    }

    /*public static Dog getDoll(int num) {
        if (num > 20) {
            Dog dog = new Dog();
            return dog;
        }
        return null;
    }

    public static Cat getDoll2(int num) {
        if (num > 20) {
            Cat cat = new Cat();
            return cat;
        }
        return null;
    }*/
}
