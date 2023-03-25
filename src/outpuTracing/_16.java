package outpuTracing;
class d1{
    static int h=10;
    d1(int k){
        System.out.println(k);
    }
    void dem(){
        System.out.println("dem super");
    }
}
class d2 extends d1{
    d2(){
        super(2);
    }
      void dem(){

    }
  void dem(int i) {
        int k=h;
        System.out.println("sub dem");
    }
}

public class _16 extends d2 {
  static int demo8() {
        System.out.println("main demo");
        return 230;
    }
    static void demo8(int k){
        System.out.println(k);
    }

    public static void main(String[] args) {
        d2 d=new d2();
       // super.dem();
        _16 d4=new _16();
       d4.demo8();
       d4.demo8();
    }
}
