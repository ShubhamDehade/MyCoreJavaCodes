package outpuTracing;

public class _11 {
    private static int data = 10;
    private static int LocalClass()
    {
        class Inner
        {
            public int data = 20;
            private int getData()
            {
                return data;
            }
        };
        Inner inner = new Inner();
        return inner.getData();
    }

    public static void main(String[] args)
    {
        System.out.println(data * LocalClass());

    }
}
