package Figure;

import Shape.Shape2D;

public class Line2D extends Shape2D {

    private Point p1;
    private Point p2;

    public Line2D(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line2D(double x1, double y1, double x2, double y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);

    }

    public Point getP1 () {
        return p1;
    }

    public void setP1 (Point p1){
        this.p1 = p1;
    }

    public Point getP2 () {
        return p2;
    }

    public void setP2 (Point p2){
        this.p2 = p2;
    }
}
