package Inheritance;

public class MultiLvevel {
    public static void main(String[] args) {

        WhatsApp3 v3= new WhatsApp3();
        v3.chatting();
        /*The only difference with inherited static (class) methods and inherited non-static (instance) methods
         is that when you write a new static method with the same signature,
         the old static method is just hidden, not overridden.
         */
        WhatsApp1.chatting();
        v3.calling();
        v3.videoCall();
    }
}
