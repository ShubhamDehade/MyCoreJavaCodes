package outpuTracing;

public class Sub extends Super{
    double demo( double a){
        return a*14.0;
    }

    public static void main(String[] args) {
            Sub s1=new Sub();
        System.out.println(s1.demo(4.0));//56.0
        System.out.println(s1.demo(4));//2
        Super s2=new Sub();
        System.out.println(s2.demo(4));//2
        Super s3=new Super();
        System.out.println(s3.demo(4));//2
    }
}
