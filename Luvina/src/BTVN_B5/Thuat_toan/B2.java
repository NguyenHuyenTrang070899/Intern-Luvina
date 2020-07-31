package BTVN_B5.Thuat_toan;

//Sắp xếp các số dương tăng dần, các số âm giữ nguyên vị trí

public class B2 {
    public static void main(String[]args) {
        int[] A = {0, -3, 9, 10, -1, 2};
        int index;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] < 0) {
                continue;
            }
            index = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[j]%2 < 0) {
                    continue;
                }
                if (A[j] < A[index]) {
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
