package SectionOne;

public class AreaOfCircle {
    static void area(double radius){
        double area= 3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        area(123);
        area(23.45 );
    }
}
