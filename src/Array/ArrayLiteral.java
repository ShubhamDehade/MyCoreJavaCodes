package Array;

public class ArrayLiteral {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,5};
        int[] arr2={2,2,4,5,6,5};
        int[] sum= new int[arr1.length];

        for (int i=0;i< arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }
        for (int a:sum) {
            System.out.println(a);
        }


    }
}
