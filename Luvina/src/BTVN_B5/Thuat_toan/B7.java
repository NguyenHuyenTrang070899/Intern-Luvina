package BTVN_B5.Thuat_toan;

//Sắp xếp sinh viên

public class B7 {
    public static void main(String args[]) {
        String[] list = {"Nguyen Van Binh",
                "Tran Van Ha",
                "Nguyen Ha",
                "Vuong Hong Thai",
                "Van Binh",
                "Nguyen Thi Huyen Trang",
                "Le Trang",
                "Le Van",
                "Doan Le Binh",
                "Le Thi Vuong Anh"};
        String temp;
        int index = 0;
        for(int i=0; i<list.length; i++){
            String[] part = list[i].split(" ");
            list[i] = part[part.length -1] + " ";
            for(int j=0; j<part.length-1;j++){
                list[i] += part[j] + " " ;
            }
        }
        for(int i=0; i<list.length; i++){
            temp = list[i];
            for(int j=i+1;j<list.length;j++){
                if(list[j].compareTo(temp)< 0){
                    temp = list[j];
                    index=j;
                }
            }
            list[index]=list[i];
            list[i]=temp;
            index = i+1;

        }
        for(int i=0; i<list.length; i++){
            String[] part = list[i].split(" ");
            list[i] = "";
            for(int j=1; j<part.length;j++){
                list[i] += part[j] + " " ;
            }
            list[i] += part[0];
        }
        for(int i=0; i<list.length;i++)
            System.out.println(list[i]);
    }
}
