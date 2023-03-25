package Multithreading.RunnableInterface;

public class Demo2Main {
    public static void main(String[] args) {
        Demo2 d2=new Demo2();
        Thread t1=new Thread(d2);
        t1.start();
        int i=1;
        while(true){
            System.out.println(i+"WORLD");
            i++;
        }
    }
}
