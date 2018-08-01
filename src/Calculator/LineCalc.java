package Calculator;

import Figure.Line2D;

public class LineCalc {

    public double lineLength(Line2D line) {
        return Math.sqrt((line.getP1().getX() - line.getP2().getX()) * (line.getP1().getX() - line.getP2().getX()) + (line.getP1().getY() - line.getP2().getY()) * line.getP1().getY() - line.getP2().getY());
    }
}
