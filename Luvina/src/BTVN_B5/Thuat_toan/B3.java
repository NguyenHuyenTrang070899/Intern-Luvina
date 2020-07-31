package BTVN_B5.Thuat_toan;

//Sắp xếp các số dương tăng dần, các số âm giảm dần. 

public class B3 {
    public static void main(String[]args) {
        int[] A = {0, -3, 9, 10, -1, 2};
        int index;
        for (int i = 0; i < A.length-1; i++) {
            index = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[j] > A[index] && A[j] < 0) {
                    index = j;
                } else if (A[j] < A[index] && A[j] >= 0) {
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
