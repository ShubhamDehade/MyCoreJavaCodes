package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int n1=sc1.nextInt();
        int temp=n1;
        int digits=String.valueOf(n1).length();
        int sum=0;
        while (n1>0){
            int r=n1%10;
            int pow=1;
            for(int i=0;i<digits;i++){
                pow*=r;
            }
            sum+=pow;
            n1=n1/10;
        }
        if(sum==temp){
            System.out.println("NUMBER IS ARMSTRONG");
        }
        else{
            System.out.println("NUMBER IS NOT ARMSTRONG");
        }
    }
}
