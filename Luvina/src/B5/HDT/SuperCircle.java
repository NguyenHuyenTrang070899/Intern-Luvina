package B5.HDT;

public class SuperCircle {
    protected int radius;  // radius co the duoc truy cap tu Sphere
    public SuperCircle(  ) {
        this(0);
    }
    public SuperCircle( int radius ) {
        this.radius = radius;
    }
    public static void main(String args[]){
        System.out.print("Hello");
    }

}
class SuperSphere extends SuperCircle {
    public SuperSphere( int rd ) {
        super(rd); // Goi constructor cua lop cha
    }
}

