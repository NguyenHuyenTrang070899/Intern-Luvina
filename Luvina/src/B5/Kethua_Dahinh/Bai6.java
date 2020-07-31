package B5.Kethua_Dahinh;

interface Moveable
{

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

class MoveablePoint implements Moveable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public String toString()
    {
        return "(x,y)=" + "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;

    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }
}

class MoveableCircle implements Moveable
{
    protected int radius;
    protected MoveablePoint center;

    public MoveableCircle(MoveablePoint moveablePoint, int radius )
    {
        this.center=moveablePoint;
        this.radius=radius;
    }


    public String toString(){
        return center + "\n" + "Radius = " + radius;
    }

    @Override
    public void moveUp() {
        center.y = center.y + center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y = center.y - center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }
}

public class Bai6 {
    public static void main(String[] args){
        MoveablePoint mp = new MoveablePoint(0, 0, 1, 2);
        mp.moveDown();
        MoveableCircle mc = new MoveableCircle(mp, 5);
        System.out.print(mc);
    }
}


