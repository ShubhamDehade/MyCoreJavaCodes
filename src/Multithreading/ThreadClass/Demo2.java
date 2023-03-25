package Multithreading.ThreadClass;

public class Demo2 extends Thread{
    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println(i+"HELLO");
            i++;
        }
    }
}
