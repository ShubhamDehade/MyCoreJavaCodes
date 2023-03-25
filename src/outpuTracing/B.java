package outpuTracing;
class A
{
    public A(String s)
    {
        System.out.print("A");
    }
}

public class B extends A
{
    public B(String s)
    {
        super("a"); //we have to write explicitly super() stmt as constructor is parameterized
        System.out.print("B");
    }
    public static void main(String[] args)
    {
        new B("C");
        System.out.println(" ");
    }
}