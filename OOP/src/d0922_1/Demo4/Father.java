package d0922_1.Demo4;

public class Father {
    int age =30;
    public void teach(){
        System.out.println("java");
    }
}

class Son extends Father{
    int age =25;

    @Override
    public void teach() {
        System.out.println("C");
    }
    public void playGame(){
        System.out.println("C++");
    }
}
