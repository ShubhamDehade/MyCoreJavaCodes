package Multithreading.SynchronizationPractice;

public class MyThread1 extends  Thread{
    Demo1 d;
  public   MyThread1(Demo1 d){
        this.d=d;
  }
    @Override
    public void run() {
        d.display("HELLO WORLD");
    }
}
