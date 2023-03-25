package Object;

public class Cylinder {
    //state i.e, properties
    double radius;
    double height;
    //behaviour i.e, function
    public  double bottomArea(){
        return Math.PI*Math.pow(radius,2) ;
    }
    public  double totalSurfaceArea(){
        return 2*bottomArea()+perimeter()*height;

    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public  double volume(){
        return bottomArea()*height;
    }
}
