package Test;

import Calculator.LineCalc;
import Calculator.ShapeCalculator;
import Figure.*;

public class Test {

    public static void main(String[] args) {

        LineCalc lineCalc = new LineCalc();
        ShapeCalculator shapeCalc = new ShapeCalculator();

        Point p1 = new Point(1,1);
        Point p2 = new Point(1,8);
        Point p3 = new Point(2,8);

        Line2D line = new Line2D(p1,p2);
        double result = lineCalc.lineLength(line);
        System.out.println(result);

        Circle circle = new Circle(p1,p2);
        double result1 = shapeCalc.circleArea(circle);
        System.out.println(result1);

        Rectangle rect = new Rectangle(p1,p2,p3);
        double result2 = shapeCalc.rectangleArea(rect);
        System.out.println(result2);

        Cube cube = new Cube(p1,p2);
        double result4 = shapeCalc.cubeVolume(cube);
        System.out.println(result4);

        Ball ball = new Ball(p1,p2);
        double result3 = shapeCalc.ballVolume(ball);
        System.out.println(result3);



    }

}
