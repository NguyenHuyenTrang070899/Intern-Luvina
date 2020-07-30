package BTVN_B4;

public class A_4 {
    public static void main(String args[]) {
        int[] A = {-3,4,-6,1,2,7,-9};
        int idx_max=0, idx_min=0, temp;
        for(int i=1; i<A.length; i++){
            if(A[i] > A[idx_max]){
                idx_max = i;
            }
            if(A[i] < A[idx_min]){
                idx_min = i;
            }
        }
        temp = A[idx_max];
        A[idx_max] = A[idx_min];
        A[idx_min] = temp;

        for(int i=0; i< A.length;i++)
            System.out.print(A[i]+" ");
    }
}
