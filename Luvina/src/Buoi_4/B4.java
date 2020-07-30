package Buoi_4;

public class B4 {
    public static void main(String args[]) {
        String string = "Hoàng Nguyễn Tuấn Anh Phương";
        String[] part = string.split(" ");
        String[] letter = new String[part.length];
        letter[0]=part[0];
        String max = part[0];
        int sl=1;
        for(int i=1; i<part.length; i++){
            if(part[i].length() == max.length()){
                sl++;
                letter[sl-1]= part[i];
            }
            if(part[i].length() > max.length()){
                max = part[i];
                sl=1;
                letter[0]=part[i];
            }
        }
        for(int i=0; i<letter.length; i++){
            if(letter[i]== null)
                System.out.print("");
            else
                System.out.print(letter[i] + " ");
        }

    }
}
