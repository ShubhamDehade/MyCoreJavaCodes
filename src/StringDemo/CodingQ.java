package StringDemo;

import java.util.Scanner;

public class CodingQ {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER STRING VALUE");
        String str=sc1.next();

        String s="";
        for (int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        System.out.println("reverse of string is "+s);
        if (s.equals(str)){
            System.out.println("String is palindrome");
        }
    }
}
