package KiemTra;

public class Bai_1 {
    public static void main(String args[]) {
        int[] A = {11, 113, -12, 64, -25, -11, 137, -45, 38};
        int[] vtdau = new int[A.length];
        int[] vtcuoi = new int[A.length];
        int max = 0;
        int dem, tong, sl = 0;
        int j;
        for (int i = 0; i < A.length; i++) {
            j = i + 1;
            tong = A[i];
            while (j < A.length && A[j] * A[j - 1] < 0) {
                tong += A[j];
                j++;
            }
            dem = j - i;
            if (tong > 100) {
                if (dem > max) {
                    max = dem;
                    sl = 1;
                    vtdau[0] = i;
                    vtcuoi[0] = j - 1;
                } else if (dem == max) {
                    vtdau[sl] = i;
                    vtcuoi[sl++] = j - 1;
                }
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
