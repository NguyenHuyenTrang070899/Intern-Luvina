package BTVN_B4;

public class A_2 {
    public static void main(String args[]) {
        int[] A = {-3,4,-6,1,2,7,-9};
        int temp;
        for(int i=0; i<A.length -1; i++)
            if (A[i] > 0)
                for (int j = i + 1; j < A.length; j++)
                    if(A[j]>0 && A[j] < A[i]){
                        temp = A[i];
                        A[i]=A[j];
                        A[j]=temp;
                    }
        for(int i=0; i< A.length;i++)
            System.out.print(A[i]+" ");
    }
}
