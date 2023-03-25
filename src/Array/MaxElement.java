package Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={1,23,2,3,2,3,5,34,224,34,555};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
