package outpuTracing;

interface Anonymous
{
    public int getValue();
}
public class Outer {
    private int data = 15;
    public static void main(String[] args)
    {
        Anonymous inner = new Anonymous()
        {
            int data = 5;
            public int getValue()
            {
                return data;
            }
            public int getData()
            {
                return data;
            }
        };
        Outer outer = new Outer();
        System.out.println(inner.getValue() + /*inner.getData() */ outer.data);
//        the method getData() is undefined in Anonymous class which causes the compilation error.
    }
}
