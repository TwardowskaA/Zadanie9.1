package Shape;

import Figure.Point;

public abstract class Shape2D extends Shape {

    private Point p1;
    private Point p2;


    public Shape2D(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Shape2D(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }


    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

}
