package Multithreading.PracticeMethods;

public class YieldDemo extends Thread{
    @Override
    public void run() {
int i=0;
       while(true){
            System.out.println(i+" I AM BUSINESS THREAD");
            i++;

       }
    }
}
