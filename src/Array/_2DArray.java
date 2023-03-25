package Array;

public class _2DArray {

    public static void main(String[] args) {
        int[][] data=new int[2][2];
        data[0][0]=100;
        data[0][1]=200;
        data[1][0]=300;
        data[1][1]=400;
        //rows
        for (int a=0;a< data.length;a++){
            //cols
            for (int k=0;k< data[a].length;k++){
                System.out.print(data[a][k]+ " ");
            }
            System.out.println();
        }

    }
}
