package Shape;


public abstract class GeometricShape extends Shape2D {

    public GeometricShape() {
    }

    private double r;

    public GeometricShape(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
