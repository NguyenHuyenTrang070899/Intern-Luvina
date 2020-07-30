package Buoi_1;

public class B5_2 {
    public static void main(String args[]) {
        int[] A = {1,2,3,23,7,8,23,10,23};
        int count = 1, end = 0, max = 1;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] < A[i+1]){
                count++;
            }
            else{
                if(count >= max){
                    end = i;
                    max = count;
                    count = 1;
                }
            }
        }
        System.out.println("Vi tri dau "+ (end - max +1) + "\nVi tri cuoi " + end);
    }
}
