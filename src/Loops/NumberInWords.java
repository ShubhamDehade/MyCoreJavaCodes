package Loops;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int n1=sc1.nextInt();
        String s1="";
        while (n1>0)
        {
            int r=n1%10;
            n1=n1/10;
            s1+=r;
        }
        System.out.println(s1);

        for(int i=s1.length()-1;i>=0;i--){
            switch (s1.charAt(i)){
                case '0':
                    System.out.print(" ZERO");
                    break;
                case '1':
                    System.out.print(" ONE");
                    break;
                case '2':
                    System.out.print(" TWO");
                    break;
                case '3':
                    System.out.print(" THREE");
                    break;
                case '4':
                    System.out.print(" FOUR");
                    break;
                case '5':
                    System.out.println(" FIVE");
                    break;
                case '6':
                    System.out.println(" SIX");
                    break;
                case '7':
                    System.out.println(" SEVEN");
                    break;
                case '8':
                    System.out.println(" EIGHT");
                    break;
                case '9':
                    System.out.println(" NINE");
                    break;

            }
        }
    }
}
