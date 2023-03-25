package ExceptionHandling.Unchecked;

public class ArrayStoreExceptionDemo {
    public static void main(String[] args) {
        Object[] arr =new String[3];
       try {
           arr[0]="SHUBHAM";
        arr[1]="DEHADE";
        arr[2]=16;
       }catch (ArrayStoreException e){
           System.out.println(e);
       }
    }
}
