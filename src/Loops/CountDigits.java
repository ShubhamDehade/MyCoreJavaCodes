package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int n=sc1.nextInt();
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
