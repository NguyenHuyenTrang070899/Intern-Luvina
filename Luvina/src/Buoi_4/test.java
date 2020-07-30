package Buoi_4;

public class test {
    public static void main(String args[]) {
        String s = "Welcome to Java!";
        String s1 = new String("Welcome to Java!");
        String s2 = s1.intern();
        System.out.println("s1 == s is " + (s1 == s));
        System.out.println("s2 == s is " + (s2 == s));
        System.out.println("s1 == s2 is " +(s1 == s2));

    }
}
