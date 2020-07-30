package Buoi_1;

public class B5_1 {
    public static void main(String args[]) {
        int[] A = {1,2,3,23,7,8,23,10,23};
        int i = 0, check = 1;
        while(i < (A.length - 1)) {
            if(A[i] >= A[i+1]) {
                check = 0;
            }
            i++;
        }
        if (check == 1)
            System.out.println("A la day tang dan.");
        else
            System.out.println("A khong la day tang dan.");
    }
}
