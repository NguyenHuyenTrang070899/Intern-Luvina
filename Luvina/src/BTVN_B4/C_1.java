package BTVN_B4;

public class C_1 {
    public static void main(String[] sgr)
    {
        String string = "    Nguyễn   Thị    Huyền Trang    ";
        string = string.trim().replaceAll("\\s+"," ");
        System.out.println(string);
    }
}
