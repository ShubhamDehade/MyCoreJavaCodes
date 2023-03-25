package Multithreading.SynchronizationPractice;

public class ATMMain {
    public static void main(String[] args) {
        ATM atm=new ATM();
        User1 c1=new User1("Smith",atm,100);
        User2 c2=new User2("John",atm,200);
        c1.start();
        c2.start();

    }
}
