package Upacsting;

public class MainApp {
    public static void main(String[] args) {
        TV t1;
        t1=new LCD();
        t1.display();

        t1=new LED();
        t1.display();
    }
       
}
