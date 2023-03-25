package Array;

public class AddArrayMatrix {
    public static void main(String[] args) {
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int[][] B={{1,2,3},{4,5,6},{7,8,9}};
        int[][] C=new int[3][3];
        for(int i=0;i< A.length;i++){
            for (int j=0;j<A[i].length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for (int x[]:C) {
            for (int y:x) {
                System.out.print(" "+y);
            }
            System.out.println();
        }
//        for (int a=0;a< C.length;a++){
//            for (int b=0;b<C[a].length;b++){
//                System.out.print(" "+C[a][b]);
//            }
//            System.out.println();
//        }

    }
}
