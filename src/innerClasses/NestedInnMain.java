package innerClasses;

public class NestedInnMain {
    public static void main(String[] args) {
        NestedInnerClass n1=new NestedInnerClass();
        n1.outer();

        NestedInnerClass.Inner n=new NestedInnerClass().new Inner();
        n.innerMeth();
    }
}
