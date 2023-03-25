package SectionOne;

import java.util.Scanner;

public class DiscountDemo {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("ENTER QUANTITY ");
        int qty=sc1.nextInt();
        System.out.println("ENTER PRICE");
        double price= sc1.nextDouble();
        calculations(qty,price);

    }
    static void calculations(int  qty,double price){
        double total=qty*price;
        if(total>0){
        if(total<500){
            total =total-total*0.05;
            System.out.println("YOU HAVE GOT 5% DISCOUNT\n FINAL AMOUNT IS "+total );
        } else if (total>500 && total<1000) {
            total=total-total*0.1;
            System.out.println("you have got 10%  dicount\nFinal cost is "+total);

        }
        if(total>1000){
            total=total-total*0.25;
            System.out.println("you have got 20% discount \final cost is "+total);
        }
        else {
            System.out.println("invalid arguments has been passed by you");
        }
    }
}}