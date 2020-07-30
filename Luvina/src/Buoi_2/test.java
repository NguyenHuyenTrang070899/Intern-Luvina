package Buoi_2;

public class test {
    public static void main(String[] args) {
        int [] A={12,5, 12,9, 12}; //
        int max=A[A.length-1]; // giả thiết A[0] là LN // i=1,.../ cập nhật, ... đi tiếp
        int sl = 1;//
        int [] vt = new int[A.length];
        vt[0]=A.length -1;
        for (int i=A.length-2; i >=0;i--)   {
            if (max==A[i]){
                sl++;
                vt[sl-1]=i;
            }
            if (max<A[i]){
                max=A[i];
                sl=1;
                vt[0]=i;

            }
        }
        if(sl == 1) {
            System.out.println("Max=" + max);
        }
        else {
            System.out.print("Max=" + max);
            System.out.print("; Soluong="+ sl);
            System.out.print("; cac vi tri=");
            for(int i = sl-1; i>0 ; i--) {
                System.out.print(vt[i] + ", ");
            }
            System.out.print(vt[0] + ".");
        }
    }
}
