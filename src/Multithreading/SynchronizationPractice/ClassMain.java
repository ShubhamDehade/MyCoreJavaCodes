package Multithreading.SynchronizationPractice;

public class ClassMain {
    public static void main(String[] args) {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);

        Students s1=new Students("1. John",wb);
        Students s2=new Students("2. Ajay",wb);
        Students s3=new Students("3. Kloob",wb);
        Students s4=new Students("4. Smith",wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
