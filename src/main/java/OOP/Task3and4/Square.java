package OOP.Task3and4;

public class Square extends Rectangle {
    public Square(String color, boolean isFilled, double length) {
        super();
        this.color = color;
        this.isFilled = isFilled;
        this.length = length;
    }

    public void getArea() {
        double area;
        area = length * length;
        System.out.println(area);
    }

    public void getPerimeter() {
        double perimeter;
        perimeter = 4 * length;
        System.out.print(perimeter);
    }

    public String toString() {
        return "Square with length of " + length + ", which is a subclass of Rectangle.";
    }
}
