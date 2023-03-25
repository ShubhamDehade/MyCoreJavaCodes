package outpuTracing;

public class Return {
    public static void main(String[] args) {
        System.out.println(demo());
    }
  static   int demo(){
        if (true){
            return 5;
        }
        else {
            return 10;
        }
    }
}
