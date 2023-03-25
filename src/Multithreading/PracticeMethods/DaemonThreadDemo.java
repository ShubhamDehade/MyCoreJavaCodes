package Multithreading.PracticeMethods;

public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<11;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
