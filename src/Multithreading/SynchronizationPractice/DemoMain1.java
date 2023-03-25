package Multithreading.SynchronizationPractice;

public class DemoMain1 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        MyThread1 t1=new MyThread1(d1);
        MyThread2 t2=new MyThread2(d1);
        t1.start();
        t2.start();

    }
}
