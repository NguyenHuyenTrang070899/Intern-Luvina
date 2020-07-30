package BTVN_B3;

public class TT2 {
    public static void main(String args[]) {
        int[] A = {6,5,9,14,19,18,20,11,13,56,15};
        int temp;
        for(int i=A.length-1; i>0; i--) {
            for (int j = A.length - 1; j >= i+1 ; j--) {
                if (A[j] < A[j - 1]) {
                    temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }

            }
        }
        for(int i=0; i< A.length;i++)
            System.out.print(A[i]+" ");
    }
}
