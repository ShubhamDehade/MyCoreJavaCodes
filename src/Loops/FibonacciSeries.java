package Loops;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int length=10;
        for (int i=0;i<length;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
