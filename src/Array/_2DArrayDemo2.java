package Array;

public class _2DArrayDemo2 {
    public static void main(String[] args) {
        String[][] data=new String[4][2];
        data[0][0]="STATE";
        data[0][1]="CAPITAL";
        data[1][0]="MAHARASHTRA";
        data[1][1]="MUMBAI";
        data[2][0]="UP";
        data[2][1]="LUCKNOW";
        data[3][0]="MP";
        data[3][1]="BHOPAL";
        //row
        for(int i=0;i< data.length;i++){
            //cols
            for(int k=0;k< data[i].length;k++){
                System.out.print(data[i][k]+"     ");
            }
            System.out.println();
        }

    }
}
