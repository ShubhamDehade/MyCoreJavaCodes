package Multithreading.PracticeMethods;

public class Demo2 extends Thread{
    Demo2(){
//        setPriority(MAX_PRIORITY);//10
//        setPriority(MIN_PRIORITY);//1
//        setPriority(NORM_PRIORITY);//5
        setPriority(MIN_PRIORITY+3);;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
