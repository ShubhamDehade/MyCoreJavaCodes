package Multithreading.PracticeMethods;

public class DaemonMain2 {
    public static void main(String[] args) {
        Daemon2 d2=new Daemon2();
        d2.setDaemon(true);
        d2.start();
        Thread mainThread=Thread.currentThread();
        try {
            //if we don't join main thread then program will not print anything
            //as priority will be completion of main thread
            mainThread.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
