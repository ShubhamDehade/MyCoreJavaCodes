package Array;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=2;
        arr[4]=3;
        arr[5]=4;
        int lastIndexFilled=5;
        //delete element from array at 2nd index
        for(int i=2+1;i<=lastIndexFilled ;i++){
            arr[i-1]=arr[i];
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
