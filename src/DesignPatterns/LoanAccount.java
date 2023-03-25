package DesignPatterns;

public class LoanAccount implements Account{
    double amount;
    LoanAccount(double amt){
        amount=amt;
    }

    @Override
    public void deposit(double amt) {
        amount-=amt;
    }

    @Override
    public void withdraw(double amt) {
        amount+=amt;
    }

    @Override
    public void showBal() {
        System.out.println(amount+" LOAN BALANCE");
    }
}
