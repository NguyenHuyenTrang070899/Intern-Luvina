package B12_KiemTra;

public class Bai2_2 {
    public static void main(String args[]) {
        int[][] A = {{2, 1, 3, 8,4},
                {4, 1, 5, 8,7},
                {2, -1, 0, 8, 6},
                {1, 0, -2, 8, 3}};
        int k = 1;
        int[] vtdau = new int[A.length];
        int[] vtcuoi = new int[A.length];
        int max = 0;
        int dem, sl = 0;
        for (int i = 0; i < A[0].length; i++) {
            int j = i + 1;
            while (j < A[0].length && (A[k][j] > A[k][j - 1])) {
                j++;
            }
            dem = j - i;
                if (dem > max) {
                    max = dem;
                    sl = 1;
                    vtdau[0] = i;
                    vtcuoi[0] = j - 1;
                }
                else if (dem == max) {
                    vtdau[sl] = i;
                    vtcuoi[sl++] = j - 1;
                }
            i = j - 1;
        }

        if (sl > 0) {
            System.out.println("So luong day: " + sl);
            System.out.println("Vi tri cac day do la: ");
            for (int i = 0; i < sl; i++) {
                System.out.println("Vi tri dau: " + vtdau[i] + ", Vi tri cuoi: " + vtcuoi[i]);
            }
        }
    }
}
