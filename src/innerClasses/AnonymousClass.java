package innerClasses;


public class AnonymousClass    {

    void Ano1(){
        AnonymousAbs a1=new AnonymousAbs() {
            @Override
            void display() {
                System.out.println("I AM ANONYMOUS OF ABSTRACT");
            }
        };
    }
     void ano2(){
        AnonymInter a2=new AnonymInter() {
            @Override
            public void displayInter() {
                System.out.println("I AM ANONYMOUS OF INTERFACE");
            }
        };
    }


}
