package StringDemo;

public class    StringDeclaration {
    public static void main(String[] args) {
        String str1="SHUBHAM";//STORED IN CONSTANT STRING POOL AREA
        String str2= new String("SHUBHAM");//STORED IN NON CONSTANT STRING POOL AREA

        char[] c={'J','A','V','A'};
        String str3= new String(c);
        System.out.println(str3);
        String str6=new String(c,1,3);//AVA
        System.out.println(str6);

        byte[] b={65,66,67,68};
        String str4=new String(b);
        System.out.println(str4);
        String str5=new String(b,1,3);//BCD
        System.out.println(str5);


    }

}
