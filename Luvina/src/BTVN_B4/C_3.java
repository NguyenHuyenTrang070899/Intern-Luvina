package BTVN_B4;

public class C_3 {
    public static void main(String args[]) {
        String string = "Hoàng Nguyễn Tuấn Anh Phương";
        String[] part = string.split(" ");
        String[] letter = new String[part.length];
        letter[0]=part[0];
        int max = part[0].length();
        int sl=1;
        for(int i=1; i<part.length; i++){
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
        for(int i=0; i<letter.length; i++){
            if(letter[i]== null)
                System.out.print("");
            else
                System.out.print(letter[i] + " ");
        }

    }
}
