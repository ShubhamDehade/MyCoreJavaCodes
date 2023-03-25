package outpuTracing;

public class _7 {
        public static void gfg(String s)
        {
            System.out.println("String");
        }
        public static void gfg(Object o)
        {
            System.out.println("Object");
        }
        public static void main(String args[])
        {
            gfg(null);
        }
    } //output will be String
/* In case of method overloading, the most specific method is chosen at compile time.
 As ‘java.lang.String’ is a more specific type than ‘java.lang.Object’.
 In this case the method which takes ‘String’ as a parameter is chosen.
 */
