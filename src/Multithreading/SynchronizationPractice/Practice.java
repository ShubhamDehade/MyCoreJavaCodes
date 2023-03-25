package Multithreading.SynchronizationPractice;

public class Practice {
    public static void main(String[] args) {
        whiteboard123 w2=new whiteboard123();
        Tutor t1=new Tutor(w2);
        student s1=new student("1.SHUBHAM",w2);
        student s2=new student("2.lokesh",w2);
        student s3=new student("3.vikas",w2);
        t1.start();

        s1.start();
        s2.start();
        s3.start();
    }
}
class whiteboard123{
    String notes;
    int count=0;
    int noofstudents=0;

    void attendence(){
        noofstudents++;
    }
    synchronized public void write(String i){

        System.out.println("TEACHER IS WRITING "+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        while(count!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        notes=i;
        count=noofstudents;

        notifyAll();

    }
    synchronized public String read(){
        while (count==0){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        String note=notes;
        count--;
        if (count==0){
            notify();
        }
        return  note;
    }
}
class  Tutor extends Thread{
    whiteboard123 p1;
    Tutor(whiteboard123 p){
        p1=p;
    }

    @Override
    public void run() {
        String arr[]={"THIS IS JAVA","OOPS","MULTITHREADING","COLLECTION FRAMEWORK","EXCEPTION HANDLING"};
        for (int i=0;i<arr.length;i++){
            p1.write(arr[i]);
        }
    }
}
class student extends Thread{
    whiteboard123 p1;
    String name;

    student(String name,whiteboard123 p){
        this.name=name;
        this.p1=p;
    }

    @Override
    public void run() {
        String note;
        p1.attendence();
        do {
           note=p1.read();
           System.out.println(name+" READING "+note);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }while(!note.equals("EXCEPTION HANDLING"));
    }
}


