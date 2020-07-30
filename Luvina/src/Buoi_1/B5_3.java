package Buoi_1;

public class B5_3 {
    public static void main(String args[]) {
        int[] A = {1,2,3,23,7,8,9,23,10,23};
        int[][] B = new int[1000][2];
        int max = 0, count = 1,i=0,j=0;
        int len = 1, start = 0, end = 0;
        while(i < A.length - 1) {
            if(A[i] >= A[i+1]) {
                if(max < len) {
                    max = len;
                    B[0][0] = start;
                    B[0][1] = end;
                    count = 1;
                }
                else if(max == len) {
                    B[count][0] = start;
                    B[count][1] = end;
                    count++;
                }
                len = 1;
                start = i+1;
                end = i+1;
            }
            else {
                len++;
                end++;
            }
            i++;
        }

        if(count == 1) {
            System.out.println("Độ dài của đoạn =" + max + "; [đầu:" + B[0][0] + ", cuối:" + B[0][1] + "]");
        }
        else {
            System.out.print("Số đoạn:= " + count + "; Độ dài của đoạn =" + max + "; {");
            while(j < count - 1) {
                System.out.print("[đầu:" + B[j][0] + ", cuối:" + B[j][1] + "]; ");
                j++;
            }
            System.out.println("[đầu:" + B[count - 1][0] + ", cuối:" + B[count - 1][1] + "]}");
        }
    }
}
