package outpuTracing;

public class Test {
    public static void main(String[] args) {
        int value = 3, sum = 6 + -- value;
        int data =(--value) +(++value ) / (sum++) * (value++) + (++sum)  % (value--) ;
        System.out.println(data);
    }
}
