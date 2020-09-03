package B12_KiemTra;

public class Bai2_1 {
    public static void main(String args[]) {
        int[][] A = {{2, 1, 3, 8},
                {4, 1, 5, 8},
                {2, -1, 0, 8},
                {1, 0, -2, 8}};
        int k = 3;
        int max = A[0][k];
        int vt[] = new int[A.length];
        vt[0] = 0;
        int sl = 1;
        for (int i = 1; i < A.length; i++) {
            if (max == A[i][k]) {
                sl++;
                vt[sl - 1] = i;
            }
            if (max < A[i][k]) {
                max = A[i][k];
                sl = 1;
                vt[0] = i;

            }
        }
        System.out.println("Cac hang chua phan tu lon nhat cot " + k);
        for(int i=0; i<vt.length; i++){
            System.out.print(vt[i]+" ");
        }
    }
}
