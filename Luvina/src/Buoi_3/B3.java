package Buoi_3;

public class B3 {
    public static void main(String[] args) {
        int x = 0;
        int[] A = {1, 2, 4, 6, 7, 9};
        int i = A.length - 2;
        while (i >= 0) {
            if (A[i] > x) {
                A[i + 1] = A[i];
            } else {
                A[i + 1] = x;
                break;
            }
            i--;
        }
        if (A[0] > x) A[0] = x;
        int j = 0;
        while (j < A.length){
            System.out.print(A[j] + " ");
            j++;
        }
    }
}
