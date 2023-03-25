package Multithreading.SynchronizationPractice;

public class Producer extends Thread{
    InterThreadCommunicationDemo1 i1;
    Producer(InterThreadCommunicationDemo1 i){
        i1=i;
    }

    @Override
    public void run() {
      int value=1;
      while (true){
          i1.set(value);
          System.out.println("PRODUCER "+value);
          value++;
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              System.out.println(e);
          }

      }
    }
}
