package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER TO KNOW ITS FACTORIAL");
        int n= sc1.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
