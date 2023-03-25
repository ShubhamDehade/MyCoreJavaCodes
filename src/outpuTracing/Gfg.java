package outpuTracing;

public class Gfg {
    Gfg()
    {
        System.out.println("Geeksforgeeks");
    }

    static Gfg a = new Gfg();

    public static void main(String args[])
    {
        Gfg b;
        b = new Gfg();
    }
}
