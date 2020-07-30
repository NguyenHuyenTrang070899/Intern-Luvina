package Buoi_2;

public class B5_cach1 {
    public static void main(String args[]) {
        int[] A = {1,2,3,23,7,8,23,10,23};
        int i = 0;
        boolean check = true;
        while(i < (A.length - 1)) {
            if(A[i] >= A[i+1]) {
                check = false;
                break;
            }
            i++;
        }
        if (check)
            System.out.println("A la day tang dan.");
        else
            System.out.println("A khong la day tang dan.");
    }
}
