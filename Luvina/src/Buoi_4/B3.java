package Buoi_4;

public class B3 {
    public static void main(String args[]) {
        String name = "Hoàng Nguyễn Tuấn Anh";
        String[] part = name.split(" ");
        System.out.println("Họ: " + part[0]);
        System.out.print("Đệm: ");
        for(int i=1; i<part.length-1;i++)
            System.out.print(part[i] + " ");
        System.out.print("\nTên: " + part[part.length-1]);
    }
}
