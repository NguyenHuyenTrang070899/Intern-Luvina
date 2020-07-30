package B5;

public class Chua_A1 {
    public static void main(String args[]) {
        int[] A = {3,4,6,1,2,4,9};
        int temp, index=0;
        for(int i=0; i<A.length -1; i++)
            if (A[i] % 2 == 1) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] % 2 == 1 && A[j] < A[i]) {
                        temp = A[j];
                        index = j;
                    }
                }
                A[index]=A[i];
                index = i+1;
            }
        for(int i=0; i< A.length;i++)
            System.out.print(A[i]+" ");
    }
}
