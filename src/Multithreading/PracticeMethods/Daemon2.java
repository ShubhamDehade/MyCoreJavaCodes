package Multithreading.PracticeMethods;

public class Daemon2 extends  Thread{
    @Override
    public void run() {
        for (int i=1;i<11;i++){
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
