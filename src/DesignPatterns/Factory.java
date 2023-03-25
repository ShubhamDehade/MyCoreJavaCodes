package DesignPatterns;

public class Factory {
    Account a;
    Account createAccount(int choice,double amount){
        if( choice==1){
             a=new SavingAccount(amount);
        }
        else if (choice==2){
             a=new LoanAccount(amount);
        }
        else {
            System.out.println("INVALID CHOICE");
        }
        return a;
    }
}
