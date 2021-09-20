package d0920.Demo3;

public class Son extends Father {
    int num=6;
    public void show(){
        System.out.println("父亲的num:"+super.num+" 子的num:"+this.num);
    }
}
