package innerClasses;

public class StaticInner {
    int x=10;
    static int y=20;
    //CLASS INSIDE CLASS WHICH IS STATIC
    static  class InnerClass{
       public void show(){
           System.out.println(y);
           System.out.println(new StaticInner().x);
       }
    }
}
