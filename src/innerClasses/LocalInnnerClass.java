package innerClasses;

public class LocalInnnerClass {
    //class inside method
    void outer(){

        class Inner{

            void innerDisplay(){
                System.out.println("HELLO");
            }
        }
        Inner i=new Inner();
        i.innerDisplay();
    }

    void abstOuter(){
        abstract class Inner{
            abstract  void absMethLocalInner();
            void innerDisplay(){
                System.out.println("HELLO");
            }
        }

        class  InnerSub extends  Inner{
            @Override
            void absMethLocalInner() {
                System.out.println("I AM OVERRIDDEN METHOD OF LOCAL INNER CLASS INSIDE SUBCLASS WHICH IS ALSO A LOCAL INNER CLASS");
            }
        }
        InnerSub is=new InnerSub();
        is.absMethLocalInner();
    }
}
