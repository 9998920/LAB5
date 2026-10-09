
package ua.opnu.model;

import java.awt.*;

public class DrawShape {

    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    private Point startPoint;
    private Point endPoint;

    public static DrawShape newInstance(int shapeType) {
        if (shapeType == SHAPE_RECTANGLE) {
            return new Rectangle();
        } else if (shapeType == SHAPE_ROUNDED_RECT) {
            return new RoundedRectangle();
        } else if (shapeType == SHAPE_ELLIPSE) {
            return new Ellipse();
        }

        return null;
    }

    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    public Shape getShape(Point startPoint, Point endPoint) {
        return null;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
