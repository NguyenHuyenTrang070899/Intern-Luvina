package Buoi_8;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

public class Chua_bai {
    public static void main(String[] args)   {
        //    doc dang text
        double [][]A=null;
        try {
            FileReader fR= new FileReader("\\Array.txt");
            //Readline;
            BufferedReader bR= new BufferedReader(fR);
            String sLine;
            sLine=bR.readLine();
            int i=-1;
            while (sLine!=null) {
                if (i==-1) // tao ma tran
                    A= new double [Integer.parseInt(sLine)][Integer.parseInt(sLine)];
                else { //tact tung phan tu
                    String [] sItem= sLine.split("\t");
                    for (int j=0; j<sItem.length;j++)
                        A[i][j]=Double.parseDouble(sItem[j]);
                }
                sLine=bR.readLine();
                i++;
            }
//            for (i=0;i<A.length;i++)
//                System.out.println(Arrays.toString(A[i]));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chua_bai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Chua_bai.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Ghi Data ra file
        try {
            FileOutputStream fO= new FileOutputStream("Array.dat");
            DataOutputStream dO= new DataOutputStream(fO);
            dO.writeInt(4);
            for (int i=0;i<A.length;i++)
                for (int j=0;j<A.length;j++)
                    dO.writeDouble(A[i][j]);
            dO.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chua_bai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Chua_bai.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Doc Data tu file
        double [][] A1=null;
        FileInputStream fI;
        try {
            fI = new FileInputStream("D:\\Array.dat");
            DataInputStream dI= new DataInputStream(fI);
            int N=dI.readInt();
            A1= new double [N][N];
            for (int i=0;i<A1.length;i++)
                for (int j=0;j<A1.length;j++)
                    A1[i][j]= dI.readDouble();
            dI.close();
            for (int i=0;i<A1.length;i++)
                System.out.println(Arrays.toString(A1[i]));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chua_bai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Chua_bai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
