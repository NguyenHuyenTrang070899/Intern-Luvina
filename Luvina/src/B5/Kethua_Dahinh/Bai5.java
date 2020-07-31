package B5.Kethua_Dahinh;

abstract class Shape
{
    protected String color;
    protected boolean filled;
    public Shape()
    {
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public boolean isFilled()
    {
        return filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    public String toString()
    {
        return getColor() + "\t" + isFilled();
    }

}

class Circle extends Shape
{
    protected double radius;
    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
        super(color, filled);
        this.radius=radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*getRadius()*getRadius();
    }
    public double getPerimeter()
    {
        return 2*Math.PI*getRadius();
    }
    public String toString()
    {
        return radius + "\t" + super.toString();
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;
    public Rectangle()
    {
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width, double length)
    {
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return width+"\t"+length+"\t"+super.toString();
    }
}

class Square extends Rectangle
{

    public Square()
    {
        super();
    }

    public Square(double side )
    {
        super(side,side);
    }

    public Square(String color, boolean filled, double side)
    {
        super(side,side,color,filled);
    }
    public double getSide ()
    {
        return super.getWidth();
    }
    public void setSide (double side)
    {
        width = side;
        length =side;
    }
    public void setWidth(double side)
    {
        setSide(side);
    }
    public void setLength(double side)
    {
        setSide(side);
    }
    public String toString()
    {
        return "Square " + super.toString();
    }
}
public class Bai5 {
    public static void main(String[] args){
        Circle circle = new Circle(3.65,"green",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(4.6,5.2,"yellow",true);
        System.out.println(rectangle);

        Square square = new Square(6.7);
        System.out.println(square);

    }
}


