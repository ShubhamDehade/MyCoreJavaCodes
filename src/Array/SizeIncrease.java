package Array;

public class SizeIncrease {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(a.length);
        int[] b=new int[2*a.length];
        for (int i=0;i<a.length;i++)
           b[i]=a[i];
        a=b;
        for (int x:a) {
            System.out.print(x+" ");
        }
        System.out.println("\n"+a.length);
       b=null;

    }
}
