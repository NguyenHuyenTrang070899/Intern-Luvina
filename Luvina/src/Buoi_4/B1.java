package Buoi_4;

public class B1 {
    public static void main(String args[]) {
        int[] A = {19,14,15,2,1,0};
        int[] list2 = new int [A.length];
        list2 = A;
        A[0]=100;
        System.out.print(list2[0]);
    }
}
