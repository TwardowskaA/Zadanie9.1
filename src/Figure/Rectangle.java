package Figure;

import Shape.GeometricShape;

public class Rectangle extends GeometricShape {

    private Point p3;
    private Point p4;


    public Rectangle(double r, Point p3, Point p4) {
        super(r);
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }
}