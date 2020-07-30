package B5;

public class Chua_B2 {
    public static void main(String args[]) {
        int[][] A = {{1,2,3},{2,-1,-3},{-7,0,6}};
        int[][] B = {{0,2,-3,4,-5},{12,-1,-13,-5,15},{-17,10,26,8,12}};
        int[][] tich = new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j = 0;j< B[0].length;j++){
                tich[i][j]=0;
                for(int k=0;k<A[0].length;k++){
                    tich[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < B[0].length; j++)
                System.out.print(tich[i][j] + " ");
            System.out.print("\n");
        }
    }
}
