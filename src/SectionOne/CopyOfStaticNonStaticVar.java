package SectionOne;

public class CopyOfStaticNonStaticVar {
    int k=10;
    static int j=120;
    public static void main(String[] args) {
        CopyOfStaticNonStaticVar c1=new CopyOfStaticNonStaticVar();
        c1.k=12;
        j=130;
        System.out.println(c1.k+" "+j);//k=12 , j=130
        CopyOfStaticNonStaticVar c2= new CopyOfStaticNonStaticVar();
        System.out.println(c2.k+" "+j);//k=10 , j=130
        c1=c2;
        System.out.println(new CopyOfStaticNonStaticVar().k+" "+c1.k+" "+c2.k);//10 10 10
        System.out.println(c1);//CopyOfStaticNonStaticVar@4554617c
        System.out.println(c2);//CopyOfStaticNonStaticVar@4554617c

    }
}
