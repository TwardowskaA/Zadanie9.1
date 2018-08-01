package Figure;

import Shape.GeometricShape;

public class Rectangle extends GeometricShape {

    private Point p3;

    public Rectangle(Point p1, Point p2, Point p3) {
        super(p1, p2);
        this.p3 = p3;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
}
