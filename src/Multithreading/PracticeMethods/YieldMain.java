package Multithreading.PracticeMethods;

public class YieldMain {
    public static void main(String[] args) {
        YieldDemo y1=new YieldDemo();
        y1.start();
        int i=1;

        while(true){
        /*The yield() method of thread class causes the currently executing
        thread object to temporarily pause and allow other threads to execute.*/
            System.out.println(i++ +" I AM MAIN THREAD");
            Thread.yield();
        }


    }
}
