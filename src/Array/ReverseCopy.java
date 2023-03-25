package Array;

public class ReverseCopy {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[3]=3;
        arr[2]=4;
        arr[5]=3;
        arr[6]=12;
        arr[7]=23;
        arr[8]=87;
        arr[9]=56;
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        int[] revArr=new int[arr.length];
        for (int i= arr.length-1,j=0;i>=0;i--,j++){
            revArr[j]=arr[i];
            System.out.print(revArr[j]+" ");
        }
    }
}
