package outpuTracing;

class Demo1{
    static
    {
        System.out.println("STATIC DEMO1 BLOCK");
    }
    {
        System.out.println("NON STATIC DEMO1 BLOCK");
    }
    Demo1(){
        System.out.println("CONSTRUCTOR");
    }
    void demo(){
        System.out.println("METHOD IN OTHER CLASS");
    }
}
public class NonStatic {
    public static void main(String[] args) {
        System.out.println("MAIN CLASS METHOD");
        Demo1 d1=new Demo1();
        d1.demo();
    }
}
