package Loops;

import java.util.Scanner;

public class ArithmaticProg
{
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER STARTING POINT AND COMMON DIFFERENCE AND HOW LONG SERIES YOU WANT");
        int s1= sc1.nextInt();
        int d1= sc1.nextInt();
        int l1= sc1.nextInt();
        int next=s1;
        while(l1>0){
            System.out.print(next+" ");
            next+=d1;
            l1--;
        }

    }
}
