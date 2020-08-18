package KiemTra;

public class Bai3_2 {
    public static void main(String args[]) {
        String[][] A = {{"abc", "abc", "cda", "Trang"},
                {"a", "aa", "cd", "abcde"},
                {"a", "b", "cdabc", "Hancg"}};
        int k = 2;
        String[] B = new String[A.length];
        for(int i=0; i<A.length;i++){
            B[i]= A[i][k];
        }
        int index;
        for(int i=0; i<B.length-1;i++){
            index = i;
            for(int j=i+1; j<B.length; j++ ){
                if(B[j].compareTo(B[index]) < 0){
                    index = j;
                }
            }
            String temp = B[i];
            B[i]= B[index];
            B[index]= temp;
        }
        for(int i = 0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}
