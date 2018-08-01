package Test;

import Calculator.LineCalc;
import Calculator.ShapeCalculator;
import Figure.*;


public class Test {

    public static void main(String[] args) {

        LineCalc lineCalc = new LineCalc();
        ShapeCalculator shapeCalc = new ShapeCalculator();

        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 8);
        Point p3 = new Point(2, 1);
        Point p4 = new Point(2, 3);


        Line2D line = new Line2D(p1, p2);
        double result = lineCalc.lineLength(line);
        System.out.printf("Długość lini wynosi:" + " " + "%.2f", result);

        Circle circle = new Circle(p1, p2);
        double result2 = shapeCalc.circleArea(circle);
        System.out.printf("\n" +"Pole koła wynosi:" + " " + "%.2f", result2);

        Rectangle rect = new Rectangle(p1,p2,p3,p4);
        double result3 = shapeCalc.rectangleArea(rect);
        System.out.printf("\n" +"Pole prostokąta wynosi" + " " + "%.2f", result3);

        Cube cube = new Cube(p1, p2);
        double result4 = shapeCalc.cubeVolume(cube);
        System.out.printf("\n" + "Objętość sześcianu wynosi:" + " " + "%.2f", result4);

        Ball ball = new Ball(p1, p2);
        double result5 = shapeCalc.ballVolume(ball);
        System.out.printf("\n" + "Objetość kuli wynosi:" + " " + "%.2f", result5);

    }


}

