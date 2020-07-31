package BTVN_B5.Thuat_toan;

//Biến đổi mảng bằng cách thay giá trị max = giá trị min và ngược lại

public class B4 {
    public static void main(String[] args) {
        int[] A = {12, 5, 5, 12, 9, 12};
        int max = A[0], min = A[0];
        int slmax = 1, slmin = 1;
        int[] vtmax = new int[A.length];
        int[] vtmin = new int[A.length];
        vtmax[0] = 0;
        vtmin[0] = 0;
        for (int i = 1 ; i < A.length ; i++) {
            if (max == A[i]) {
                slmax++;
                vtmax[slmax - 1] = i;
            }
            if (max < A[i]) {
                max = A[i];
                slmax = 1;
                vtmax[0] = i;

            }
            if (min == A[i]) {
                slmin++;
                vtmin[slmin - 1] = i;
            }
            if (min > A[i]) {
                min = A[i];
                slmin = 1;
                vtmin[0] = i;

            }
        }
        for(int j = 0; j < slmax; j++)
            A[vtmax[j]] = min;
        for(int j = 0; j < slmin; j++)
            A[vtmin[j]] = max;
        for(int i = 0; i<A.length; i++)
            System.out.print(A[i] + " ");
    }
}
