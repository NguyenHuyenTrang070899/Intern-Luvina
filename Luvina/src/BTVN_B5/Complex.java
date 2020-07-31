package BTVN_B5;
import java.util.Scanner;

public class Complex {
    private double real,imag;
    public Complex() {
        real = 0.0;
        imag = 1.0;
    }
    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public Complex(Complex c){
        real = c.real;
        imag = c.imag;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public String toString(){
        if(imag>0)
            return real + " + " + imag + "i";
        else
            return real + imag + "i";
    }
    public Complex Add(Complex b){
        Complex c = new Complex();
        c.real = real + b.real;
        c.imag = imag + b.imag;
        return c;
    }
    public static Complex Add(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }

    public Complex Sub(Complex b){
        Complex c = new Complex();
        c.real = real - b.real;
        c.imag = imag - b.imag;
        return c;
    }
    public static Complex Sub(Complex a, Complex b){
        Complex c = new Complex();
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        return c;
    }
    public Complex Mul(Complex b){
        Complex c= new Complex();
        c.real = real * b.real - imag * b.imag;
        c.imag = real * b.imag + b.real * imag;
        return c;
    }
    public static Complex Mul(Complex a, Complex b){
        Complex c= new Complex();
        c.real = a.real * b.real - a.imag * b.imag;
        c.imag = a.real * b.imag + b.real * a.imag;
        return c;
    }
    public Complex Div(Complex b) {
        Complex c = new Complex();
        c.real = (real * b.real + imag * b.imag) / (Math.pow(b.real, 2) + Math.pow(b.imag, 2));
        c.imag = (b.real * imag - imag * b.real) / (Math.pow(b.real, 2) + Math.pow(b.imag, 2));
        return c;
    }
    public static Complex Div(Complex a, Complex b) {
        Complex c = new Complex();
        c.real = (a.real * b.real + a.imag * b.imag) / (Math.pow(b.real, 2) + Math.pow(b.imag, 2));
        c.imag = (b.real * a.imag - a.imag * b.real) / (Math.pow(b.real, 2) + Math.pow(b.imag, 2));
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số thứ nhất: ");
        System.out.print("Nhập phần thực và ảo: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Complex a = new Complex(x,y);
        System.out.println("Số thứ hai: ");
        System.out.print("Nhập phần thực và ảo: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        Complex b = new Complex(x,y);
        System.out.println("(" + a + ") + (" + b + ") = " + a.Add(b));
        System.out.println("(" + a + ") - (" + b + ") = " + a.Sub(b));
        System.out.println("(" + a + ") x (" + b + ") = " + a.Mul(b));
        System.out.println("(" + a + ") : (" + b + ") = " + a.Div(b));
        System.out.println("(" + a + ") + (" + b + ") = " + Add(a,b));
        System.out.println("(" + a + ") - (" + b + ") = " + Sub(a,b));
        System.out.println("(" + a + ") x (" + b + ") = " + Mul(a,b));
        System.out.println("(" + a + ") : (" + b + ") = " + Div(a,b));
    }

}

