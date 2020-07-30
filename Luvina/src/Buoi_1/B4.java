package Buoi_1;

public class B4 {
    public static void main(String[] args) {
        int [] A={12,5,5,12,9,12};
        int max=A[A.length-1];
        int sl = 1;
        int [] vt = new int[A.length];
        int i=A.length-2;
        vt[0]=A.length -1;
        while (i >=0)   {
            if (max==A[i]){
                sl++;
                vt[sl-1]=i;
            }
            if (max<A[i]){
                max=A[i];
                sl=1;
                vt[0]=i;

            }
            i--;
        }
        if(sl == 1) {
            System.out.println("Max=" + max);
        }
        else {
            System.out.print("Max=" + max);
            System.out.print("; Soluong="+ sl);
            System.out.print("; cac vi tri=");
            int j=sl-1;
            while(j>0) {
                System.out.print(vt[j] + ", ");
                j--;
            }
            System.out.print(vt[0] + ".");
        }
    }
}
