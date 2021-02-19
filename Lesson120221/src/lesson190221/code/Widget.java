package lesson190221.code;

public class Widget {
    private int iField;
    private float fField;

    public Widget(int iField, float fField)
    {
        this.iField = iField;
        this.fField = fField;
    }

    public Widget(Widget other)
    {
        this.fField = other.fField;
        this.iField = other.iField;
    }

    public void setiField(int value)
    {
        iField = value;
    }

    public static Widget duplicate(Widget source)
    {
        return new Widget(source.iField, source.fField);
    }

    public void print()
    {
        System.out.print(iField);
        System.out.print(", ");
        System.out.println(fField);
    }
}
