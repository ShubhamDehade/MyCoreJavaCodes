package SectionOne;

public class TransportCharge {
    static void bill(int qty,double price, double transportCharges){
        //apply 10% gst
        double total=qty*price;
        double gst=total*0.1;
        double finalAmount=total+gst+transportCharges;

        System.out.println("10% GST "+gst +" rs");
        System.out.println("final amount "+finalAmount);
    }

    public static void main(String[] args) {
        bill(3,2000,55);
    }
}
