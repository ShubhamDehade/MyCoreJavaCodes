package Multithreading.SynchronizationPractice;

public class MyThread2 extends Thread {
    Demo1 d;
    public   MyThread2(Demo1 d){
        this.d=d;
    }
    @Override
    public void run() {
        d.display(" WELCOME EVERYONE");
    }
}
