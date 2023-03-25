package Multithreading.SynchronizationPractice;

public class Demo1 {

 synchronized public void  display(String name){
//            synchronized (this)
//            {
                 for (int i = 0; i < name.length(); i++)
                 {
                     System.out.print(name.charAt(i) + " ");
                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         System.out.println(e);
                     }
                 }
//            }
  }
}
