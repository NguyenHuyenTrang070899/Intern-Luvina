package Buoi_3;

public class B2_test {
    public static void main(String args[]) {
        int[] A = {6,5,9,14,19,7,18,20,11};
        int c=A.length-1, maxLen =1, luuC=0, i=A.length-2;
        while(i>=0){
            if(A[i]>A[i+1]){
                if(maxLen< c-i){
                    luuC=c;
                    maxLen=c-i;
                }
                c=i;
            }
            i--;
        }

        System.out.println("Vi tri dau "+ (luuC-maxLen+1) + "\nVi tri cuoi " + luuC);
    }
}
