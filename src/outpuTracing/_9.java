package outpuTracing;

public class _9 {
    public static void main(String args[])
    {
        short s = 0;
        int x = 07;
       //Any number beginning with zero is treated as an octal number (which is 0-7).
        //so it gives compile error for int y=08;
         int y = 06;
        int z = 112345;
        short c=34;
        int b=c;
         c=(short)y;
         //in below line we are adding and assigning together so, it's working,
        //if we assign only then it will give compile time error as integer will be assigned to short
        s += z;
        System.out.println("" + x + y + s);
    }
}
