package EnumAndLambdaExpressions;

public class EnumMain1 {
    public static void main(String[] args) {
        Dept d1=Dept.IT;
        Dept []list=Dept.values();
        for (Dept d:list){
            System.out.println(d);
        }
    }
}
