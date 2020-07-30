package BTVN_B4;

public class B_2 {
    public static void main(String args[]) {
        int[][] A = {{1,2,3,4,5},{2,-1,-3,-5,5},{-7,0,6,8,1}};
        int[][] B = {{0,2,-3,4,-5},{12,-1,-13,-5,15},{-17,10,26,8,12}};
        for(int i=0;i<A.length;i++){
            for(int j = 0;j< A[0].length;j++){
                System.out.print((A[i][j]*B[i][j])+ " ");
            }
            System.out.print("\n");
        }

    }
}
