package outpuTracing;

public class _8 {
    public static void gfg(String s)
    {
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
    public static void gfg(Integer i)
    {
        System.out.println("Integer");
    }

    public static void main(String args[]) {
        //gfg(null); compile time error
        //compiler will confuse which one to choose as,
        // between String and Integer, no one is more specific compared to other
    }
}
