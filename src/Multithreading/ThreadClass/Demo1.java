package Multithreading.ThreadClass;

public class Demo1 extends Thread{
    @Override
    public void run() {
        int i=1;
        while (true){
            System.out.println(i+" HELLO");
        }
    }

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.start();
        int i=1;
        while(true){
            System.out.println(i+"WORLD");
            i++;
        }
    }
}
