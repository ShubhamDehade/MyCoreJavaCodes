package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,4,5434,3344,34,34,45556,45};
        int max1= arr[0];;
        int max2=arr[0];
        for(int i=1;i< arr.length;i++){

                if(arr[i]>max1){
                    max2=max1;
                    max1=arr[i];
                }
                else if (arr[i]>max2){
                    max2=arr[i];
                }

        }
           System.out.print(max2);
        }
    }

