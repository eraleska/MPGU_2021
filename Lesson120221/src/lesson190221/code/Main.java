package lesson190221.code;

public class Main {
    public static void main(String[] args)
    {
        Widget w1 = new Widget(10, 1.1f);

        Widget w2 = new Widget(w1);

        Widget w3 = Widget.duplicate(w1);

        w1.print();
        w2.print();
        w3.print();

        w2.setiField(20);
        w3.setiField(30);

        w1.print();
        w2.print();
        w3.print();
    }
}
