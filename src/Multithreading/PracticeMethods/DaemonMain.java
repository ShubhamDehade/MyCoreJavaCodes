package Multithreading.PracticeMethods;

public class DaemonMain {
    public static void main(String[] args) {
        DaemonThreadDemo d1=new DaemonThreadDemo();
//        d1.setDaemon(true);
//        d1.start();
        //for above code only, nothing will be printed as Daemon is low priority thread
        //it will ask main to continue and finish
        d1.setDaemon(true);
        d1.start();
        //below code is for sleeping main thread
        //as main thread will sleep for some time daemon thread will continue working
        try {
            Thread.sleep(1000);//1 sec
        } catch (InterruptedException e) {
            System.out.println(e);
        }
     //   Thread mainThread=Thread.currentThread();//mainThread is reference used
        //we can do above for any class but not needed as we can join by using reference of object created
        //of that class and perform operations on it
        //i/e,
        DaemonThreadDemo d2=new DaemonThreadDemo();
        d2.start();
        try {
            d2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
