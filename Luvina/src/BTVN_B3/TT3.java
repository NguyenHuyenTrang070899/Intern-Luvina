package BTVN_B3;

public class TT3 {
    public static void main(String args[]) {
        int[] A = {19,14,15,2,1,0};
        int temp,i,j;
        for (i = 1; i < A.length; i++) {
            temp = A[i];
            for(j=i-1;j>=0;j--){
                if(A[j]> temp)
                    A[j + 1]=A[j];
                else{
                    A[j + 1] = temp;
                    break;
                }
            }
            if(A[0] > temp) A[0]=temp;

        }
        for (i = 0; i < A.length; ++i)
            System.out.print(A[i] + " ");
    }
}
