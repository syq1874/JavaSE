package d0912;

public class Node {
    //上一个元素
    private Node pre;
    //当前的元素
    private Object obj;
    //下一个元素
    private Node next;

    public Node getPre() {
        return pre;
    }

    public Object getObj() {
        return obj;
    }

    public Node getNext() {
        return next;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
