package BTVN_B9_B10;

public class B6_1 {
    public static void main(String[]args) {
        int[] A = {0, 3, 9, 10, 4, 5, 2, 7, 8, 19, 13, 14, 6};
        int m = 4, n = 8;
        int index;
        for (int i = m; i <= n; i++) {
            index = i;
            for (int j = i+1; j <= n; j++) {
                if (A[j] > A[index]) {
                    index = j;
                }
            }
            int temp = A[index];
            A[index] = A[i];
            A[i] = temp;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
