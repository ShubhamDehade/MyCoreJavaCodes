package Array;

public class _3D {
    public static void main(String[] args) {
        int[][][] data=new int[2][2][2];
        //1st row
        data[0][0][0]=1;
        data[0][0][1]=2;
        data[0][1][0]=3;
        data[0][1][1]=4;
        //2nd row
        data[1][0][0]=5;
        data[1][0][1]=6;
        data[1][1][0]=7;
        data[1][1][1]=8;

        for (int i=0;i< data.length;i++){
            for (int j=0;j< data.length;j++){
                for (int k=0;k< data.length;k++){
                    System.out.print(data[i][j][k]+"\t");
                }

            }
            System.out.println();
        }




    }
}
