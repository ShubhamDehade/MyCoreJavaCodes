package outpuTracing;

public class _12 {
    static int demo(){
        int k=10;  //static  int k=10 is not allowed inside method body as its is associated with class
        return k;

    }

    public static void main(String[] args) {
       // static int d=10;  static  int k=10 is not allowed inside method body as its is associated with class
        demo();
    }
}
