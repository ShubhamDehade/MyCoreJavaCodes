package Multithreading.SynchronizationPractice;

public class Consumer extends Thread{
    InterThreadCommunicationDemo1 i1;
    Consumer(InterThreadCommunicationDemo1 i){
        i1=i;
    }

    @Override
    public void run() {
 int value;
        while (true){
            value=i1.get();
            System.out.println("CONSUMER "+value);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
