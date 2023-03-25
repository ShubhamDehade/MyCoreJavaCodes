package CallByVR;

public class CallByValue {
    public static void main(String[] args) {

        area(1234);  //call by value
    }
    static void area(int r){
        double area=3.14*r*r;
        System.out.println(area);
    }
}
