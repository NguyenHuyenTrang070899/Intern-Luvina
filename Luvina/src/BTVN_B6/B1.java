package BTVN_B6;

import java.io.*;
import java.util.Scanner;

public class B1
{

    public static void readContentFromFile(String path) throws IOException
    {
        FileInputStream file = new FileInputStream(path);
        Scanner in = new Scanner(file);
        int words = 0;
        int lines = 0;
        int chars = 0;
        while(in.hasNextLine())  {
            lines++;
            String line = in.nextLine();
            for(int i=0;i<line.length();i++)
            {
                if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
                    chars ++;
            }
            String[] word = line.split(" ");
            words += word.length;
        }
        System.out.println("Số dòng: " + lines);
        System.out.println("Số từ: " + words);
        System.out.println("Số kí tự: " + chars);
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
