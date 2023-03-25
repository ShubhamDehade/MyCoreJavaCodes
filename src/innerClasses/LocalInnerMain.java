package innerClasses;

public class LocalInnerMain {
    public static void main(String[] args) {
        LocalInnnerClass l1=new LocalInnnerClass();
        l1.outer();
        // as inner class is inside method i.e, local we cannot create object of it here
        //because local members are not accessible outside method
        l1.abstOuter();
    }
}
