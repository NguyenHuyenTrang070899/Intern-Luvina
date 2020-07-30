package BTVN_B4;

import java.util.Arrays;

public class C_5 {
    public static void main(String args[]) {
        String[] Student = {"Nguyen Van Binh",
                "Tran Quang Khai",
                "Nguyen Tran Quang",
                "Vuong Doc Nhat",
                "Binh Van Binh",
                "Nghiem Van Vo",
                "Le Quoc Binh",
                "Le Van Veo",
                "Doan Le Binh",
                "Le Le Le"};
        for(int i=0; i<Student.length-1; i++) {
            for(int j=Student.length-1; j>i; j--) {
                int pos1 = Student[j].length()-1;
                while(Student[j].charAt(pos1) != ' ') {
                    pos1--;
                }
                int pos2 = Student[j-1].length()-1;
                while(Student[j-1].charAt(pos2) != ' '){
                    pos2--;
                }
                String str1 = Student[j].substring(pos1);
                String str2 = Student[j-1].substring(pos2);
                if(str1.compareTo(str2) < 0) {
                    String tmp = Student[j];
                    Student[j] = Student[j-1];
                    Student[j-1] = tmp;
                }
                else if(str1.compareTo(str2) == 0) {
                    if(Student[j].compareTo(Student[j-1]) < 0) {
                        String tmp = Student[j];
                        Student[j] = Student[j-1];
                        Student[j-1] = tmp;
                    }
                }
            }
        }
        for(int i=0; i<Student.length; i++) {
            System.out.println(Student[i]);
        }
    }
}
