package Buoi_1;

public class B2 {
    public static void main(String[] args) {
        int n= 17, i = 2, check = 1;
        while (i < n/2){
            if (n % i == 0){
                check = 0;
                break;
            }
            i++;
        }
        if(check == 0)
            System.out.print( n + " khong la so nguyen to");
        else
            System.out.print( n + " la so nguyen to");
    }
}
