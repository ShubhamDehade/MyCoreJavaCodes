package SectionOne;

public class StaicBlock {
 int k;

    static {
        System.out.println("this is static clock");
        StaicBlock s=new StaicBlock();
    }

    public static void main(String[] args) {

        System.out.println("main method");
        System.out.println(new StaicBlock().k);
    }
    {
        System.out.println("non static block");
    }
}
