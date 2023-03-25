package ExceptionHandling.Checked;

public class FinallyDemo2 {
  static   void test() throws Exception {
       try {
           throw new  Exception();
       }
       finally {
           System.out.println("I AM FINALLY BLOCK IN TEST METHOD");
       }
    }

    public static void main(String[] args) {
        try {
            test();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
