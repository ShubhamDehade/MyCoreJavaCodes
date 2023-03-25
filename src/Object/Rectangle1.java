package Object;

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=120.11;
        r1.breadth=50.50;
        System.out.println(r1.perimeter());
        System.out.println(r1.area());
        System.out.println(r1.isSquare());
    }
}
