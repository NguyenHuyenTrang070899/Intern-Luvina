package BTVN_B5.Thuat_toan;

//Tính định thức

public class B6 {
    public static void main(String arg[]) {
        double A[][] = {
                {0, 1, -1, 3},
                {0, 2, -1, 3},
                {0, 3, 2, -1},
                {0, 3, 1, -1}
        };
        double DT = 1;
        for (int k = 0; k < A.length; k++) {
            if (A[k][k] == 0) {
                for (int i = k + 1; i < A.length; i++) {

                    double max = 0;
                    int temp = 0;
                    for (int t = k; t < A.length; t++) {
                        if (max < Math.abs(A[t][k])) {
                            max = Math.abs(A[t][k]);
                            temp = t;
                        }
                    }
                    if (max == 0) {
                        System.out.println("DT = 0");
                        return;
                    } else {
                        for (int t = k; t < A.length; t++) {
                            double tam = A[k][t];
                            A[k][t] = A[temp][t];
                            A[temp][t] = tam;
                        }
                        DT = -DT;
                    }
                    double tmp = A[i][k] / A[k][k];
                    for (int j = k; j < A.length; j++) {
                        A[i][j] = A[i][j] - (A[k][j] * tmp);
                    }
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            DT = DT * A[i][i];
        }
        System.out.println("ĐT = " + DT);
    }
}
