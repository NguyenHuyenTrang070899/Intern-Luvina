package BTVN_B5.Thuat_toan;

//Tính định thức

public class B6 {
    public static void main(String arg[]) {
        int a[][] = {{1, 2, 3, 4}, {2, 3, 4, 5}, {-1, 3, -5, 1}, {3, 7, -5, -2}};
        int dem=0,kt = 0;
        float b[] = new float[100];
        float c[] = new float[100];
        int n = a.length;
        int m = a[0].length;
        float h, det=1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i][i]==0)
            {
                kt=0;
                for(int j=0;j<m;j++)
                    if(a[i][j]!=0)
                    {
                        for(int k=0;k<n;k++)
                        {// Doi cot j voi cot i
                            c[k]=a[k][i];
                            a[k][i]=a[k][j];
                            a[k][j]= (int) c[k];
                        }
                        dem++;// dem so lan doi cot
                        kt++;// Kiem tra xem co so 0 o dong i cot j
                        break;
                    }
            }
            if(kt == 0)
                System.out.print("0");
            b[i]=a[i][i];
            for(int j=0;j<n;j++)
                a[i][j]= (int) (a[i][j]/b[i]);//tao so 1 o dong i,cot i
            for(int j=i+1;j<n;j++)
            {
                h=a[j][i];
                for(int k=0;k<n;k++)
                    a[j][k]= (int) (a[j][k]-h*a[i][k]);//lay dong thu j-h*dong i
            }
        }
        b[n-1]=a[n-1][n-1];
        for(int i=0;i<n;i++)
            det=det*b[i];// Nhan cac so da lay ra ngoai dinh thuc
        if(dem%2==0)
            System.out.print(det);
        else
            System.out.print(-det);
    }
}
