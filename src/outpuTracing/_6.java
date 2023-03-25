package outpuTracing;
class Base {
    protected  void foo() {}
}
class Derived extends Base {
//    void foo() {   here it gives compile time error as, foo() is protected in parent and in subclass it is default
    //so, we can increase access but, cant reduce access of method
    //i.e, private->default->protected-> public is possible but
   // private<-default<-protected<- public  is not possible
//        System.out.println("vds");
//    }
    public void foo(){
        System.out.println("i am public foo");
    }
}
public class _6 {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.foo();
    }
}

