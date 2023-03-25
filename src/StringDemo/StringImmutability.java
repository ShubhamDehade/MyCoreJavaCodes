package StringDemo;

public class StringImmutability {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        System.out.println(s1==s2);//true
        s1="CORE"+s1;
        System.out.println(s1==s2);//false
        String s3=new String("JAVA");
        String s4=new String("JAVA");
        System.out.println(s3==s4);//false



    }
}
