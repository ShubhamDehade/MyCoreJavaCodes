package outpuTracing;

public class _1 {
    public static void main(String[] args) {
        Integer n1=100;
        Integer n2=100;
        Integer n3=500;
        Integer n4=500;
       if (n1==n2){
           System.out.println("n1==n2");
           System.out.println(System.identityHashCode(n1)+" "+System.identityHashCode(n2));
       }
       else {
           System.out.println("n1!=n2");
       }
        if (n4==n3){
            System.out.println("n3==n4");
        }
        else {
            System.out.println("n3!=n4");
            System.out.println(System.identityHashCode(n3)+" "+System.identityHashCode(n4));
        }
    }
/* We always thought that whenever two object references are compared using “==”,
 it always evaluates to “false”. But here Integer caching changes the results.
 Integer class has a caching range of -128 to 127. Whenever a number is between this range and autoboxing is used,
  it assigns the same reference. That’s why for value 100, both num1 and num2 will have the same reference,
  but for the value 500 (not in the range of -128 to 127),
num3 and num4 will have different reference.*/

}
