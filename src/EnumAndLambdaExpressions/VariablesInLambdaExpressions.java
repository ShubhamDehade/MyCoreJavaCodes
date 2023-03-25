package EnumAndLambdaExpressions;

public class VariablesInLambdaExpressions {
  static   int x=10;
    public static void main(String[] args) {
        int count=1;
        final int num=2;
        MyLambda1 m=()->{
            System.out.println("HI");
            System.out.println(count);
            System.out.println(num);
            //any loacl variable is allowed if it is final or not going to be modified later
            //i.e below line is not allowed
           // System.out.println(count++);
            //class variables/instance variables are allowed with any modification as they are not needed to be final
            System.out.println(++x);
            //we can also have own variables inside lambda expression
            int sd=1;
            sd++;
            System.out.println(sd);
        };
        m.display();
    }
}
