package Buoi_4;

public class test4 {
    public static void main(String args[]) {
        String name = "Hoàng Nguyễn Tuấn Anh";
        String[] part = name.split(" ");
        for(int i=part.length-1; i>=0;i--)
            System.out.print(part[i] + " ");

    }
}
