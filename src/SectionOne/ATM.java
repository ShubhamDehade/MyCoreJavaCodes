package SectionOne;

import java.util.Scanner;

public class ATM {
    static Scanner sc1= new Scanner(System.in);
    static double accountBalance=5000;
    static int pinNo=1234;

    static {

        System.out.println("SELECT LANGUAGE\n1.ENGLISH\n2.MARATHI");
        int option=sc1.nextInt();
        if(option==1)
            System.out.println("ENGLISH SELECTED");
        else if (option==2) {
            System.out.println("MARATHI SELECTED");
        }
        else
            System.exit(0);

    }
    static{
        System.out.println("ENTER PIN");

    }

    public static void main(String[] args) {
        int pin=sc1.nextInt();
        if(pinNo==pin)
        {
            System.out.println("SELECT OPTION\n1.WITHDRAW AMOUNT\n2.CHECKBALANCE\n3.CHANGE PIN");
            int option= sc1.nextInt();
            switch(option){
                case 1:{
                    System.out.println("ENTER AMOUNT TO BE WITHDRAWN");
                    double amt=sc1.nextDouble();
                    withdraw(amt);
                    break;
                }
                case 2: checkBal();
                break;
                case 3:changePin();
                break;
                default:
                    System.out.println("ENTER PROPER INPUT");
                    break;
            }
        }

    }

    private static void withdraw(double amt) {
        if (amt <= accountBalance) {
            accountBalance -= amt;
            System.out.println("AMOUNT WITHDRAWN");
            System.out.println("CURRENT BAL " + accountBalance);
        }
        else
            System.out.println("ENTER PROPER INPUT");
    }
    static void checkBal(){
        System.out.println(accountBalance);
    }
    static void changePin(){
        System.out.println("ENTER NEW PIN");
        int newPin= sc1.nextInt();
        pinNo=newPin;
        System.out.println("PIN CHANGED");
    }
}
