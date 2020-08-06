package BTVN_B7;

import java.io.*;

public class DET2 {

    public static void main(String[] args) {
        try {

            String line;

            FileOutputStream fos = new FileOutputStream("dothi.dat", false);
            PrintWriter pw = new PrintWriter(fos);

            pw.println("1 2 -3 4");
            pw.println("-1 3 5 1");
            pw.println("4 1 2 2");
            pw.println("-1 -2 -2 3");

            pw.close();

            FileReader pr = new FileReader("dothi.dat");
            BufferedReader br = new BufferedReader(pr);

            int rows = 0;
            String[] tmp;

            double a[][] = new double [7][7];
            int x = 0;

            while ((line = br.readLine()) != null) {
                tmp = line.split(" ");
                rows = tmp.length;
                for (int i = 0; i < rows; i++) {
                    a[x][i] = Double.parseDouble(tmp[i]);
                }
                x++;
            }

            int check = 1;
            double DT = 1;

            for (int i = rows -1; i >=0; i--) {
                if (a[i][i] == 0) {
                    // tim 1 hang, doi cho
                    for (int j = i-1; j >=0; j--) {
                        if (a[j][i] != 0) {
                            // doi hang i voi hang j
                            double temp;
                            for (int k = i; k >= 0; k--) {
                                temp = a[i][k];
                                a[i][k] = a[j][k];
                                a[j][k] = temp;
                            }
                            check *= -1;
                            break;
                        }
                    }
                    // khong tim duoc hang => dinh thuc = 0;
                    if (a[i][i] == 0) {
                        DT = 0;
                        break;
                    }
                }
                double thuaSo;
                for (int j = i-1; j >=0; j--) {
                    if (a[j][i] != 0) {
                        thuaSo = a[j][i]/a[i][i];
                        a[j][i] = 0;
                        for (int k=i -1; k >=0; k--) {
                            a[j][k] -= a[i][k]*thuaSo;
                        }
                    }
                }
                DT *= a[i][i];
            }
            DT *= check;

            for (int i = 0; i< rows; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("ĐT = " + DT);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
