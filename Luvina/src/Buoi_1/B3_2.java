package Buoi_1;

public class B3_2 {
    public static void main(String[] args) {
        int[] A = {11, 2, 4, 8, 10, 287};
        int i = 1, min = A[0];
        while (i < A.length) {
            if (A[i] < min) {
                min = A[i];
            }
            i++;
        }
        System.out.println("Min: " + min);
    }
}
