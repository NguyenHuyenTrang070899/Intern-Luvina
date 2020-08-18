package KiemTra;

public class Bai3_3 {
    public static void main(String args[]) {
        String[][] A = {{"abc", "abc", "a", "Trang"},
                {"a", "aa", "c", "abcde"},
                {"a", "b", "", "Hancg"}};
        int k = 3;
        int max = A[0][k].length();
        String vt[] = new String[A.length];
        vt[0] = A[0][k];
        int sl = 1;
        for (int i = 1; i < A.length; i++) {
            if (max == A[i][k].length()) {
                sl++;
                vt[sl - 1] = A[i][k];
            }
            if (max < A[i][k].length()) {
                max = A[i][k].length();
                sl = 1;
                vt[0] = A[i][k];

            }
        }
        System.out.println("Cac phan tu dai nhat cot " + k);
        for(int i=0; i<vt.length; i++){
            System.out.println(vt[i]);
        }
    }
}
