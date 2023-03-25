package Multithreading.ThreadClass;

import Multithreading.ThreadClass.Demo2;

public class Demo2Main {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
        d1.start();
        int i=0;
        while(true){
            System.out.println(i+"WORLD");
            i++;
        }
    }
}
