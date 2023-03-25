package Array;



public class ShoppingArray {
    static String[] product={"TV","MOBILE","AC","PROJECTOR"};
   static int[] stock={10,20,5,4};
   static double[] price={10000,8000,35000,20000};

    void calculateBill(int choice,int qty){
       if(stock[choice]>=qty){
           double Billprice=price[choice]*qty;
           stock[choice]-=qty;
           System.out.println("BILL PRICE "+Billprice);
       }
       else if(stock[choice]<qty){
           System.out.println("OUT OF STOCK");
       }
    }
//    static String[] product={"TV","MOBILE","AC"};
//    static int[] quantity={4,5,6};
//    static double[] price={12300,8500,33000};
//    void bill(int prod,int qty){
//        boolean status=false;
//        for(int a=0;a<product.length;a++){
//        if(prod==a && qty<=quantity[a] ){
//            double total=qty*price[a];
//            System.out.println("TOTAL BILL " +total);
//            quantity[a]-=qty;
//            status=true;
//        }
//    }
//    if(!status)
//        System.out.println("OUT OF STOCK");
//    }

}
