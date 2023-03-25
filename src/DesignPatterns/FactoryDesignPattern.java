package DesignPatterns;

import java.util.Scanner;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        Factory f1=new Factory();
        System.out.println("CREATE ACCOUNT\n1.SAVING \n2.LOAN");
        int accType=sc1.nextInt();
        System.out.println("ENTER INITIAL AMOUNT");
        double amount= sc1.nextDouble();
        Account accRef=f1.createAccount(accType,amount);
        boolean status =true;

        while (status){
            System.out.println("1.DEPOSIT AMOUNT\t2.WITHDRAW AMOUNT\t3.SHOW BALANCE\t4.EXIT");
            int option= sc1.nextInt();
            if (option==1){
                double amt= sc1.nextDouble();
                accRef.deposit(amt);
            } else if (option==2) {
                double amt= sc1.nextDouble();
                accRef.withdraw(amt);
            } else if (option==3) {
                accRef.showBal();
            }
            else {
                status=false;
            }
        }
    }
}
