package Ponto2D;
import java.lang.Math;
public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double DistOrigin(){
        double dist = Math.sqrt(getX() * getX() + getY() * getY());
        return dist;
    }
    
}
