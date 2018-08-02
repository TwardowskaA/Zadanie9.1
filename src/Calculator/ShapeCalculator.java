package Calculator;

import Figure.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    public double circleArea(Circle circle) {

        Circle circle1 = new Circle(circle.getR());
        return  Math.PI * Math.pow(circle1.getR(), 2);
    }


    public double rectangleArea(Rectangle rectangle) {

        Line2D line = new Line2D(rectangle.getP3(),rectangle.getP4());
        double a = lineLength(line);
        double b = rectangle.getR();
        double result = a * b;
        return result;
    }


    public double ballVolume(Ball ball) {
        Line2D line = new Line2D(ball.getP1(), ball.getP2());
        double r = lineLength(line) / 2;
        return (4.0/ 3.0) * Math.PI * Math.pow(r, 3);

    }

    public double cubeVolume(Cube cube){
        Line2D line = new Line2D(cube.getP1(), cube.getP2());
        double length = lineLength(line);
        return Math.pow(length,3);

    }

}
