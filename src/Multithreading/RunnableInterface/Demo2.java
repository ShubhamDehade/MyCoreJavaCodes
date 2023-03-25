package Multithreading.RunnableInterface;

public class Demo2 implements  Runnable{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println(i+"HELLO");
            i++;
        }
    }
}
