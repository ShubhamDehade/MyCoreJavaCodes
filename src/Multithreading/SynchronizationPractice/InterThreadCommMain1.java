package Multithreading.SynchronizationPractice;

public class InterThreadCommMain1 {
    public static void main(String[] args) {
        InterThreadCommunicationDemo1 i=new InterThreadCommunicationDemo1();
        Producer p1=new Producer(i);
        Consumer c1=new Consumer(i);
        p1.start();
        c1.start();
    }
}
