package BTVN_B4;

public class C_4 {
    public static void main(String args[]) {
        String[] list = {"Nguyễn Văn An",
                        "Lê Văn Bình",
                        "Dương Hoàng Bình",
                        "Lê Văn Trung",
                        "Phạm Hoài Ngọc",
                        "Đỗ Hòa Bình"
        };
        int count=0;

        for(int i=0; i<list.length; i++){
            String[] part = list[i].split(" ");
            if(part[part.length-1].equals( "Bình")){
                count++;
            }
        }
        System.out.print(count);
    }
}
