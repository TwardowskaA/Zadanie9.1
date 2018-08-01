package Figure;

import Shape.Shape2D;

public class Line2D extends Shape2D {

    public Line2D(Point p1, Point p2) {
        super(p1, p2);
    }

    public Line2D(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }
}
