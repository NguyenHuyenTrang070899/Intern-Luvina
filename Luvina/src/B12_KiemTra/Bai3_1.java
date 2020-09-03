package B12_KiemTra;

public class Bai3_1 {
    public static void main(String args[]) {
        String[][] A = {{"abc", "abc", "a", "Trang"},
                {"a", "aa", "c", "abcde"},
                {"a", "b", "", "Hancg"}};
        int k = 3;
        int max = A[0][k].length();
        int vt[] = new int[A.length];
        vt[0] = 0;
        int sl = 1;
        for (int i = 1; i < A.length; i++) {
            if (max == A[i][k].length()) {
                sl++;
                vt[sl - 1] = i;
            }
            if (max < A[i][k].length()) {
                max = A[i][k].length();
                sl = 1;
                vt[0] = i;

            }
        }
        System.out.println("Cac hang chua phan tu dai nhat cot " + k);
        for(int i=0; i<vt.length; i++){
            System.out.print(vt[i]+" ");
        }
    }
}
