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
                    sl=1;
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

    public static void main(String[] args)
    {
        try {
            readContentFromFile("C:\\Users\\ASUS\\Desktop\\Intern-Luvina\\Intern-Luvina\\Luvina\\src\\BTVN_B6\\In.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
