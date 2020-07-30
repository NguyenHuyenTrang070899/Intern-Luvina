package BTVN_B3;

public class TT1 {
    public static void main(String args[]) {
        int[] A = {6,5,9,14,19,18,20,11,13,56,15};
        int index=0, temp;
        for(int i=0; i<A.length-1; i++){
            temp = A[i];
            for(int j=i+1;j<A.length;j++){
                if(A[j]<temp){
                    temp = A[j];
                    index=j;
                }
            }
            A[index]=A[i];
            A[i]=temp;
            index = i+1;

        }
        for(int i=0; i< A.length;i++)
            System.out.print(A[i]+" ");
    }
}
