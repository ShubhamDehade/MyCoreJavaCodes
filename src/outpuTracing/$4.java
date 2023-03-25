package outpuTracing;
class Point {
    protected int x, y;
    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}
public class $4 {
         public static void main(String args[])
        {
          //  Point p = new Point();
            //  if we create any parameterized constructor then,
            //  compiler will not provide default constructor ,so writing above line gives compile-time error

            Point p = new Point(2,3);
            System.out.println("x = " + p.x + ", y = " + p.y);
        }


}
