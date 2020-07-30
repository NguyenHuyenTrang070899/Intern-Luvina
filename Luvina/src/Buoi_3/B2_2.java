package Buoi_3;

public class B2_2 {
    public static void main(String args[]) {
        int[] A = {9,5,9,14,19,7,18,20,11};
        int c=A.length-1, maxLen =1, luuC=0, i=A.length-2;
        while(i>=0){
            if(A[i]<A[i+1]){
                if(maxLen< c-i+1){
                    maxLen=c-i+1;
                    luuC=c;
                }
            }
            else
                c=i;
            i--;
        }

        System.out.println("Vi tri dau "+ (luuC-maxLen+1) + "\nVi tri cuoi " + luuC);
    }
}
