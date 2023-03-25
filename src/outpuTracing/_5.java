package outpuTracing;
class Demo{
    Demo(int i){
        System.out.println("constructor called "+i);
    }
}
public class _5 {
    _5(int i){
       Demo d2=new Demo(i);
    }
    Demo d1=new Demo(2); //class variables will be loaded first then constructor

    public static void main(String[] args) {
        _5 n1=new _5(10);
    }
}
