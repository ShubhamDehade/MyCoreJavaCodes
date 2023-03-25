package Loops;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int n1=sc1.nextInt();
        int temp=n1;
        int rev=0;
        while(n1>0){
            int r=n1%10;
            rev=rev*10+r;
            n1=n1/10;
        }
        if(temp==rev)
            System.out.println("NUMBER IS PALINDROME");
        else
            System.out.println("NOT A PALINDROME");
    }
}
