package Loops;

import java.util.Scanner;

public class GeometricProg {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("ENTER STARTING POINT AND MULTIPLICATION FACTOR and length of series");
        int s1=sc1.nextInt();
        int m1=sc1.nextInt();
        int l1=sc1.nextInt();

        for(int i=0;i<l1;i++){
            System.out.print(s1+" ");
            s1*=m1;
        }
    }
}
