package ExceptionHandling.Unchecked;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=4;
        arr[1]=3;
        arr[2]=5;

        try {
            arr[3]=7;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//it will print only problem not exception i.e, 3
        }
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
