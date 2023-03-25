package EnumAndLambdaExpressions;

public class LambdaDemo3 {
    public static void main(String[] args) {
        MyLambdaDemo3 m3=(a,b)->a+b;
        /*
        * MyLambdaDemo m3=(a,b)->{
        * return a+b;
        * }*/
        System.out.println(m3.add(20,30));
    }
}
