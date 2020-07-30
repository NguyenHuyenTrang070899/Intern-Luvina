package Buoi_1;

public class B3_1 {
    public static void main(String[] args) {
        int [] A = {1, 2, 4, 8, 10, 287};
        int i = 1, max = A[0];

        while(i < A.length){
            if(max < A[i]){
                max = A[i];
            }
            i++;
        }

        System.out.println("Max: " + max);

    }
}
