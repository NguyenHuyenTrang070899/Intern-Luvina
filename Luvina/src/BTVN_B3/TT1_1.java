package BTVN_B3;

public class TT1_1 {
    public static void main(String[] args) {
        int arr[] = {0,6,3,4,8,1,2};
        int i, j, last;
        for (i=1; i < arr.length; i++) {
            last = arr[i];
            j = i;
            while ((j > 0) && (arr[j - 1] > last)) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = last;
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
