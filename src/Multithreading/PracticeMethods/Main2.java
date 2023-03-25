package Multithreading.PracticeMethods;

public class Main2 {
    public static void main(String[] args) {
        Demo2 d2=new Demo2();
        d2.start();
        d2.interrupt();//it doesn't skip any operation only if thread is waiting or sleep it interrupts


    }
}
