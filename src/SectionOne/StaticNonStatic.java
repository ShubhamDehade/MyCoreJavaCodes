package SectionOne;

public class StaticNonStatic {
    double  k=1234;
    int y=1234;
    void cal(){
        double mul=k*y;
    }
    public static void main(String[] args) {
        double sum=new StaticNonStatic().k*new StaticNonStatic().y;
    }
}
