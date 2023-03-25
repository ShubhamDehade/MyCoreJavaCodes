package Object;

public class Rectangle {

    double length;
    double breadth;
    public  double area(){
        return length*breadth;
    }
    public  double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if (length==breadth)
            return true;

        else
            return false;
    }
}

