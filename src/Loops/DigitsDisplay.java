package Loops;

import java.util.Scanner;

public class DigitsDisplay {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int a= sc1.nextInt();
        while(a>0){
            int r=a%10;
            a=a/10;
            System.out.println(r);
        }
    }
}
