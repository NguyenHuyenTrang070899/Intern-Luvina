package Buoi_6;

public class NewClass {
    public static void main(String args[]){
        System.out.println("Vung 1");
        try{
            System.out.println("Vung 2 - trong try truoc lenh");
            int i = 10/0;
            System.out.println("Vung 3 - trong try sau lenh");
        }
        catch (Exception e){
            throw new ArithmeticException(e.getMessage());
            //System.out.println("Vung 4 - trong catch");
        }
        System.out.println("Vung 5 - Sau try/catch");
    }
}
