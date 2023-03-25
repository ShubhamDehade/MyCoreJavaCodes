package outpuTracing;

public class Inner {
  /* static  not allowed*/
    Inner(){

    }
    static {
        //static block
    }
    {
        //non-static block
    }
    public static void main(String[] args) {
        {
            int  k=0;
            int d=10;
        }
//        static
//        {  static block cannot be defined in method
//
//        }

        //System.out.println(k+d); cannot access it will give compile error
    }
   static   void demo(){
//        static
//         {
//            static block cannot be defined in method
//         }
       {

       }
     }
}
