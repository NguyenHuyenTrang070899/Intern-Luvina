package Caro;

import java.io.*;

public class readTxt {
    public static void abc(String luu[][]) {
        try {
            String line;
            FileReader pr = new FileReader("abc.dat");
            BufferedReader br = new BufferedReader(pr);
            String[] tmp;
            String a[][] = new String[5][5];

            while ((line = br.readLine()) != null) {
                int x = 0;
                while (x < 5) {
                    tmp = line.split(" ");
                    for (int i = 0; i < 5; i++) {
                        a[x][i] = tmp[i];
                    }
                    x++;
                    if (x != 4) {
                        line = br.readLine();
                    }
                }
                check(a, luu);
            }

            br.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public static boolean checkArray(String a[][], String b[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((a[i][j] == "X" && b[i][j] != "X") || (a[i][j] == "O" && b[i][j] != "O") || (a[i][j] == "G" && b[i][j] != "")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void position(String a[][], String b[][]) {
        if (checkArray(a, b) == true) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (a[i][j] == "G" ) {
                        AI.nextMoveX = i;
                        AI.nextMoveY = j;
                    }
                }
            }
        }

    }
    public static void check(String a[][], String b[][]) {
        String temp[][] = new String[5][5];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        temp[k][l] = b[i + k][j + l];
                    }
                }
                position(a, temp);
            }
        }
    }
}
