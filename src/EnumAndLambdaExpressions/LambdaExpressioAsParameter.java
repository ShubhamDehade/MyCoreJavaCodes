package EnumAndLambdaExpressions;

import AbstractClass.Main;

interface MyLambda{
    void display();
}
class UseLambda{
    public  void callLambda(MyLambda ml){
        ml.display();
    }
}
class Demo{
    public void meth1(){
        UseLambda u1=new UseLambda();
        u1.callLambda(()-> System.out.println("HI I AM LAMBDA EXPRESSION AS PARAMETER"));
    }
}
public class LambdaExpressioAsParameter {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.meth1();
    }
}
