package OOP.Task3and4;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
    }

    ;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void getArea() {
        double area;
        area = length * width;
        System.out.println(area);
    }

    public void getPerimeter() {
        double perimeter;
        perimeter = 2 * (width + length);
        System.out.print(perimeter);
    }

    public String toString() {
        return "Rectangle with width of " + width + " and length of " + length + ", which is a subclass of Shape.";
    }
}
