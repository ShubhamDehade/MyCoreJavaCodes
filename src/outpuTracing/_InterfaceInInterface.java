package outpuTracing;


interface OuterInterface
{
    public void InnerMethod();
    public interface InnerInterface
    {
        public void InnerMethod();
    }
}
public class _InterfaceInInterface implements OuterInterface.InnerInterface, OuterInterface
{
    public void InnerMethod()
    {
        System.out.println(100);
    }


    public static void main(String[] args)
    {
        _InterfaceInInterface obj = new _InterfaceInInterface();
        obj.InnerMethod();
    }
}