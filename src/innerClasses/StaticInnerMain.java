package innerClasses;

public class StaticInnerMain {
    public static void main(String[] args) {
        StaticInner.InnerClass sti=new StaticInner.InnerClass();
        sti.show();
        System.out.println(new StaticInner().x);
    }
}
