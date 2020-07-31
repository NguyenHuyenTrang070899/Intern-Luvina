package BTVN_B5;

class Circle {
    protected double radius;
    protected String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;

    }
    public String toString()
    {
        return "Radius = " + getRadius() + " - Color = " + getColor() + " - Area = " + getArea();
    }

}

public class Cylinder extends Circle {
    protected double height;
    public Cylinder( double radius, String color, double height)
    {
        super( radius, color);
        this.height = height;
    }
    public void setHeight( double height ){
        this.height = height ;
    }
    public double getHeight()
    {	return height; }

    public double getVolume()
    { return super.getArea() * height;}

    public String toString()
    {
        return super.toString() + " - Height = " + height + " - Volume = " + getVolume();
    }
    public static void main(String args[]){
        Circle circle = new Circle( 3.5, "Red" );
        Cylinder cylinder = new Cylinder( 10, "Yellow", 10 );
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
