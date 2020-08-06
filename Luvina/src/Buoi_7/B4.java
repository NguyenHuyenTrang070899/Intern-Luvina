package Buoi_7;

import java.io.*;
import java.util.Scanner;

public class B4
{

    public static void readContentFromFile(String path) throws IOException
    {
        FileInputStream file = new FileInputStream(path);
        Scanner in = new Scanner(file);
        String[] letter = new String[100];
        int max = 0;
        int sl=0;

        while(in.hasNextLine())  {

            String line = in.nextLine();

            String[] part = line.split(" ");


            for(int i=0; i<part.length; i++){
                if(part[i].length() == max){
                    sl++;
                    letter[sl-1]= part[i];
                }
                if(part[i].length() > max){
                    max = part[i].length();
                    sl=0;
                    letter[0]=part[i];
                }
            }

        }

        for(int i=0; i<letter.length; i++){
            if(letter[i]== null)
                System.out.print("");
            else
                System.out.print(letter[i] + " ");
        }

    }
    public static void copyFile() throws IOException
    {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("Bangdiem.txt"));
            outStream = new FileOutputStream(new File("Bangdiem1.txt"));


            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("\nFile is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            readContentFromFile("Bangdiem.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        copyFile();

    }
}
