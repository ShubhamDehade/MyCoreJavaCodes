package outpuTracing;

class Clidder
{
    private final void flipper()
    {
        System.out.println("Clidder");
    }
}

public class _final extends Clidder
{
    public final void flipper()
    {
        System.out.println("Clidlet");
    }
    public static void main(String[] args)
    {
        new _final().flipper();
    }
}
