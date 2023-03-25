package DesignPatterns;

public class SavingAccount implements Account{
      double amount;
    SavingAccount(double amt){
        amount=amt;
    }

    @Override
    public void deposit(double amount) {
        this.amount+=amount;
        System.out.println(amount+" RS. DEPOSITED SUCCESSFULLY");
    }

    @Override
    public void withdraw(double amount) {
        this.amount-=amount;
        System.out.println(amount+" RS. WITHDRAWN SUCCESSFULLY");

    }

    @Override
    public void showBal() {
        System.out.println(amount);
    }
}
