package Array;

public class Inserting {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=1;
        arr[5]=1;
        //insert 15 at 2nd index
        int num=15;
        int index=2;
        for(int i=5;i>2;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=num;
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
