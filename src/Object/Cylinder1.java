package Object;

public class Cylinder1 {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.height=120.11;
        c1.radius=40.12;
        System.out.println(c1.bottomArea());
        System.out.println(c1.perimeter());
        System.out.println(c1.totalSurfaceArea());
        System.out.println(c1.volume());
    }
}
