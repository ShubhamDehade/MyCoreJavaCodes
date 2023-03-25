package Inheritance;

public class WhatsApp2 extends WhatsApp1{
    static void chatting(){
        System.out.println("CHANGING FUNCTIONALITY BUT NOT OVERRIDDEN");
    }
    void calling(){
        System.out.println("THIS IS SUBCLASS OF V1\nYOU CAN CALL");
    }
}
