package OOP.Task1and5;

public class Line {
    Point2D beginPoint;
    Point2D endPoint;

    public Line(Point2D beginPoint, Point2D endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Line(float beginPoint1, float endPoint1,float beginPoint2, float endPoint2) {
        this.beginPoint = new Point2D(beginPoint1, endPoint1);
        this.endPoint = new Point2D(beginPoint2, endPoint2);
    }

    public void setBeginPoint(Point2D beginPoint) {
        this.beginPoint = beginPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public Point2D getBeginPoint() {
        return beginPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public double calculateLength() {
        double length = Math.sqrt((Math.pow(endPoint.x - endPoint.y, 2) + Math.pow(beginPoint.x - beginPoint.y, 2)));
        return length;
    }
}
