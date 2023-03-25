package Array;

public class ShiftingElementsToLEFT {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int []demo=new int[3];
        for (int i=0;i< demo.length;i++){
            demo[i]=arr[i];       //1 2 3
        }
        int index= demo.length;
       for (int i=0;i< arr.length- demo.length;i++){
           arr[i]=arr[index++];  //4 5 6 7 8 6 7 8
       }

       int ind=0;
       for (int i=arr.length- demo.length;i< arr.length;i++){
           arr[i]=demo[ind++];  // 4 5 6 7 8 1 2 3
       }
//        int temp=arr[0];
//        int index=0;
//        for(int i=1;i< arr.length;i++){
//            arr[index]=arr[i];
//            index++;
//        }
//        arr[arr.length-1]=temp;
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}

