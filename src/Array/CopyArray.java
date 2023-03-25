package Array;

public class CopyArray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,9};
        int[] copy=new int[arr.length];

        for(int i=0;i< arr.length;i++){
            copy[i]=arr[i];
        }
        for (int x=0;x<arr.length;x++)
        {
            System.out.print(copy[x]+" ");

        }
    }
}
