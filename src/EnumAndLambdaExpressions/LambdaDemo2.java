package EnumAndLambdaExpressions;

public class LambdaDemo2 {
    public static void main(String[] args) {
        MyLambdaDemo2 m2=(d)->{
            System.out.println(d);
        };
        m2.display("I AM PARAMETERIZED LAMBDA EXPRESSION DEMO");
    }
}
