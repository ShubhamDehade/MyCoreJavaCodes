package outpuTracing;

public class $3 {
    public static void main(String[] args) {
        $3 b=new $3();
        System.out.println(b.demo());
        {
            int k=7987; 
        }
        int n = $45.n;
       int k= n/0; //arithmatic exception
    }
   int demo(){
      int x=1;  //we cannot make local variable static
//       static local variables are not allowed in Java
        return ++x;
    }
  public    static class $45{
        static Integer m=100;
        static int n=m;
       
        
    }
  
}
