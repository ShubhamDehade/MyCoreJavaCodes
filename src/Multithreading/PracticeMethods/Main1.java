package Multithreading.PracticeMethods;

public class Main1 {
    public static void main(String[] args) {

        Demo1 d1=new Demo1("THREAD 1 ");
        System.out.println("THREAD ID "+d1.getId());
        System.out.println("THREAD NAME "+d1.getName());
        System.out.println("THREAD STATE "+d1.getState());
        d1.start();
        System.out.println("THREAD STATE "+d1.getState());
        System.out.println("get priority "+d1.getPriority());

    }
}
