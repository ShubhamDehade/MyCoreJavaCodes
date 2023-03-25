package ExceptionHandling.Checked;

public class finallyDemo1 {
    public static void main(String[] args) {
        try {
            int n1=15/0;
        }finally {
            System.out.println("ARITHMATIC EXCEPTION IS NOT HANDLED");
        }
    }
}
