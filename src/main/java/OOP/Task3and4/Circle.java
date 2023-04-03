package OOP.Task3and4;

public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    ;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        double area;
        area = 3.14 * (radius * radius);
        System.out.println(area);
    }

    public void getPerimeter() {
        double perimeter;
        perimeter = 2 * 3.14 * radius;
        System.out.print(perimeter);
    }

    @Override
    public String toString() {
        return "Circle with the radius " + radius + ", which is a subclass of " + super.toString();
    }
}
