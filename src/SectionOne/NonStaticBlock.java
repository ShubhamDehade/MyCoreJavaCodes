package SectionOne;

public class NonStaticBlock {
    public NonStaticBlock() {
        System.out.println("I AM CONSTRUCTOR WITH ACCESS MODIFIER");
    }

    static void NonStaticBlock(){

       System.out.println("I AM METHOD NOT CONSTRUCTOR");
    }
    static int count;
    {
        System.out.println("ACCOUNT CREATED");
        createProfile();
        count++;
    }
    void createProfile(){
        System.out.println("PROFILE CREATED");
    }

    public static void main(String[] args) {
        NonStaticBlock n1=new NonStaticBlock();
        NonStaticBlock n2=new NonStaticBlock();
        NonStaticBlock n3= new NonStaticBlock();

        System.out.println("TOTAL NO. OF CREATED ACCOUNTS "+count);
    }
}
