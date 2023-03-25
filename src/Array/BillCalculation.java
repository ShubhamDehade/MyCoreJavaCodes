package Array;

public class BillCalculation {
    void billCal(double[] amount){
        double[] gstValues =gstCal(amount);
        double[] totalAmt=new double[amount.length];
        for (int i=0;i< totalAmt.length;i++){
            totalAmt[i]+=amount[i]+gstValues[i];
        }
        double totalAmount=0;
        double totalGST=0;
        double finalAmount=0;

        for(int i=0;i<amount.length;i++){
            totalAmount+=amount[i];
            totalGST+=gstValues[i];
            finalAmount+=totalAmt[i];
        }
        System.out.println("AMOUNT\tGST\tTOTAL");
        System.out.println("======================================================");
        for(int i=0;i<amount.length;i++) {
            System.out.println(amount[i]+"\t"+gstValues[i]+"\t"+totalAmt[i]);
        }
        System.out.println("======================================================");
        System.out.println(totalAmount+"\t"+totalGST+"\t"+finalAmount);

        }
    public double[] gstCal(double[] amount){
        double[] gstAmt=new double[amount.length];
        for(int i=0;i<amount.length;i++){
            if(amount[i]<=500){
                gstAmt[i]=amount[i]*0.05;//5% gst
            }
            else {
                gstAmt[i]=amount[i]*0.15;
            }
        }
        return gstAmt;
    }


    }

