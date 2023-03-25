package Array;

public class ArraySort {
    public static void main(String[] args) {
        String[] arr={"SAMRAT","RAHUL","SHUBHAM","ANIL","DEHADE","VAISHALI"};
        java.util.Arrays.sort(arr);
        for (String x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        int[]  arr1[]=new int[1][1];
        arr1[0][0]=1;
        System.out.println(arr1);

        String n="java";
        System.out.println(n.startsWith("j"));
    }
}
