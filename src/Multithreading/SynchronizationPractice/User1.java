package Multithreading.SynchronizationPractice;

public class User1 extends Thread{
    String name;
    int amount;
    ATM atm;

    User1(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}
