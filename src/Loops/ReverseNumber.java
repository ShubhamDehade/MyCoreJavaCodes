package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int n1= sc1.nextInt();
        int rev=0;
        while(n1>0){
            int r=n1%10;
            rev=rev*10+r;
            n1=n1/10;
        }
        System.out.println(rev);
//        String s1="";
//        while (n1>0){
//            int r=n1%10;
//            s1+=r;
//            n1=n1/10;
//        }
//        System.out.println(s1);
    }
}
