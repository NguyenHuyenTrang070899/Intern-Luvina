package Caro;
import java.util.Random;

public class AI {
    public static int nextMoveX;
    public static int nextMoveY;
    static Random generator = new Random();
    public static int RandomInt(int n){
        return generator.nextInt(n);
    }
}
