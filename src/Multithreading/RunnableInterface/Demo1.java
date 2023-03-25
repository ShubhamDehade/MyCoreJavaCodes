package Multithreading.RunnableInterface;

public class Demo1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println(i+"HELLO");
            i++;
        }
    }

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Thread t1=new Thread(d1);
        t1.start();
        int i=0;
        while(true){
            System.out.println(i+"WORLD");
            i++;
        }
    }
}
