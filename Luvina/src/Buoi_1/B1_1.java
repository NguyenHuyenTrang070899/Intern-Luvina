package Buoi_1;

public class B1_1 {

    public static void main(String[] args) {
        int a = 11;
        int b = 101;
        int c = 37;
        int max = a;
        if (max < b)
            max = b;
        else
            if (max < c)
                max = c;
        System.out.print(max);
    }
}