package BTVN_B6;

import java.io.*;

public class B2
{


    public static void checkFile(String path1, String folderPath) throws IOException
    {
        File file = new File(path1);
        File folder = new File(folderPath);
        if (!file.exists())
            System.exit(0);
        else
            if(!folder.exists())
                folder.mkdir();

    }


    public static void main(String[] args)
    {

        try {
            checkFile("C:\\Users\\ASUS\\Desktop\\Intern-Luvina\\Intern-Luvina\\Luvina\\src\\BTVN_B6\\Out.txt","C:\\Users\\ASUS\\Desktop\\Intern-Luvina\\Intern-Luvina\\Luvina\\src\\test");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
