package Buoi_2;

public class chua5_2 {
    public static void main(String args[]) {
        int[] A = {1,2,3,2,4,3,5,6};
        int d=0, maxLen =1, luuD=0, i=1;
        while(i<=A.length-1){
            if(A[i-1]<A[i])
                if(maxLen<= i-d+1){
                    maxLen=i-d+1;
                    luuD=d;
                }
            else{
                d=i;
            }
            i++;
        }

        System.out.println("Vi tri dau "+ luuD + "\nVi tri cuoi " + (luuD+maxLen-1));
    }
}
