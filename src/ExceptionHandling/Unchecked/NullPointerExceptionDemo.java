package ExceptionHandling.Unchecked;

public class NullPointerExceptionDemo {
 static    String s1=null;
    public static void main(String[] args) {
        try {
            System.out.println(s1.toLowerCase());
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
