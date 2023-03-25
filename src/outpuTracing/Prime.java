package outpuTracing;

public class Prime {
    public static boolean isPrime (int number) {
        for (int div =2; div <= number / 2; div++)
            if (number % div == 0)
                return false;   // we found a number div that num is divisible by

        return true;
    }

    public static void main(String[] args) {
        System.out.println(" is a number a prime number?");
        int  x = 41;
        if (isPrime (x) )
            System.out.println(x + " is a prime number");


    }

}