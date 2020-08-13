package BTVN_B9_B10;

public class B6_2 {
    public static void main(String[]args) {
        int[] A = {0, 3, 9, 10, 4, 5, 2, 7, 8, 19, 13, 14, 6};
        int m = 4, n = 8;
        int index;
        int i = m;
        while (i <= n) {
            index = i;
            int j = i + 1;
            while (j <= n) {
                if (A[j] > A[index]) {
                    index = j;
                }
                j++;
            }
            int temp = A[index];
            A[index] = A[i];
            A[i] = temp;
            i++;
        }
        i = 0;
        while (i < A.length) {
            System.out.print(A[i]+" ");
            i++;
        }
    }
}
