package innerClasses;

public class NestedInnerClass {
    //CLASS INSIDE CLASS
    int x=2;
    class Inner{
        int y=4;
        void innerMeth(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outer(){
        Inner i= new Inner();

        i.innerMeth();
        System.out.println(i.y);
    }
}
