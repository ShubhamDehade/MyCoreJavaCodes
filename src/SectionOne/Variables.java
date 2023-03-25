package SectionOne;

public class Variables {
    static int a;//class variable
    int b;//instatnce variable

    public static void main(String[] args) {
        Variables v=new Variables();
       // static int c=0;=>not possible to make static local variable
        int c=0;//local variable
        v.nonstatic();
    }
    void nonstatic(){
        int c=num();//local variable
        System.out.println(c);
    }
    int num(){
        int k=1345;//local variable
        return k;
    }
}
